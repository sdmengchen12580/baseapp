package com.example.mylibrary.httpUtils.utils;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolMyDownLoadUtils {

    private ExecutorService pool;
    private static volatile PoolMyDownLoadUtils sInstance;
    private final int MAX_DOWNLOADING_TASK = 5; // 最大同时下载数
    public static String TAG = "测试贴纸下载";

    private PoolMyDownLoadUtils() {
        pool = new ThreadPoolExecutor(
                MAX_DOWNLOADING_TASK, MAX_DOWNLOADING_TASK, 40, TimeUnit.SECONDS,
                new ArrayBlockingQueue<Runnable>(2000));
    }

    public static PoolMyDownLoadUtils getInstance() {
        if (sInstance == null) {
            synchronized (PoolMyDownLoadUtils.class) {
                if (sInstance == null) {
                    sInstance = new PoolMyDownLoadUtils();
                }
            }
        }
        return sInstance;
    }

    //获取下载贴纸队列得文件夹
    public File getDownLoadTzFile(Context context, String fileFactory) {
        return createFileDir(context, fileFactory);
    }

    //添加下载队列任务
    public void addMyLoadTask(final Context context, String fileFactory, final String fileName, final String imgNetUrl, final Handler handler, final String tikerName, final String SaveFileName) {
        final File file = createFileDir(context, fileFactory);
        //本地文件存在,如果下载完成,此下载任务delect
        if (isFileExists(file, fileName)) {
            LogUtils.logE(TAG, fileName + "本地存在相同文件,删除它");
            new File(file, fileName).delete();
        }
        //开始下载
        if (handler != null) {
            Message m = handler.obtainMessage();
            m.what = 0x1;
            handler.sendMessage(m);
            LogUtils.logE(TAG, "开始下载");
        }
        //添加任务
        pool.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    int readTimeout = 300000;
                    int connectTimeout = 300000;
                    URL url = new URL(imgNetUrl);
                    URLConnection conn = url.openConnection();
//                    conn.setUseCaches(true);
                    conn.setConnectTimeout(connectTimeout);
                    conn.setReadTimeout(readTimeout);
                    InputStream in = conn.getInputStream();
//                    long contentLength = conn.getContentLength();
//                   LogUtils.logE(TAG, fileName + "文件的服务器大小contentLength=" + contentLength);
                    File f = new File(file, fileName);
                    FileOutputStream fo = new FileOutputStream(f);
                    byte[] buffer = new byte[1024 * 1024];
                    int len = 0;
                    LogUtils.logE(TAG, "开始下载");
                    while ((len = in.read(buffer)) > 0) {
                        fo.write(buffer, 0, len);
                    }
                    in.close();
                    fo.flush();
                    fo.close();
                    LogUtils.logE(TAG, "下载完成了,开启解压~");
                    if (handler != null) {
                        Message m = handler.obtainMessage();
                        m.what = 0x2;
                        m.obj = tikerName + "##" + SaveFileName;
                        handler.sendMessage(m);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    //下载失败
                    if (handler != null) {
                        Message m = handler.obtainMessage();
                        m.what = 0x3;
                        m.obj = tikerName;
                        handler.sendMessage(m);
                        LogUtils.logE(TAG, "下载失败");
                    }
                }
            }
        });
    }

    //检查是否存在SD卡
    public static boolean hasSdcard() {
        String state = Environment.getExternalStorageState();
        if (state.equals(Environment.MEDIA_MOUNTED)) {
            return true;
        } else {
            return false;
        }
    }

    //创建目录
    public static File createFileDir(Context context, String dirName) {
        String filePath;
        // 如SD卡已存在，则存储；反之存在data目录下
        if (hasSdcard()) {
            filePath = Environment.getExternalStorageDirectory()
                    + File.separator + dirName;
        } else {
            filePath = context.getCacheDir().getPath() + File.separator + dirName;
        }
        File destDir = new File(filePath);
        if (!destDir.exists()) {
            boolean isCreate = destDir.mkdirs();
            Log.e(TAG, filePath + " has created. " + isCreate);
        }
        return destDir;
    }

    //删除文件（若为目录，则递归删除子目录和文件）
    public static void delFile(File file, boolean delThisPath) {
        if (!file.exists()) {
            return;
        }
        if (file.isDirectory()) {
            File[] subFiles = file.listFiles();
            if (subFiles != null) {
                int num = subFiles.length;
                // 删除子目录和文件
                for (int i = 0; i < num; i++) {
                    delFile(subFiles[i], true);
                }
            }
        }
        if (delThisPath) {
            file.delete();
        }
    }

    //获取文件大小，单位为byte（若为目录，则包括所有子目录和文件）
    public static long getFileSize(File file) {
        long size = 0;
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] subFiles = file.listFiles();
                if (subFiles != null) {
                    int num = subFiles.length;
                    for (int i = 0; i < num; i++) {
                        size += getFileSize(subFiles[i]);
                    }
                }
            } else {
                size += file.length();
            }
        }
        return size;
    }

    //判断文件是否存在
    public static boolean judgeFielEs(File file) {
        if (file.exists()) {
            return true;
        }
        return false;
    }

    // 判断某目录下文件是否存在
    public static boolean isFileExists(File dir, String fileName) {
        return new File(dir, fileName).exists();
    }
}
