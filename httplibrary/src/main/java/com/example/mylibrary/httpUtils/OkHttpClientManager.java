package com.example.mylibrary.httpUtils;

import android.content.Context;
import android.os.Environment;
import com.example.mylibrary.httpUtils.utils.LogUtils;
import java.io.File;
import java.io.IOException;

import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;


public class OkHttpClientManager {

    private static OkHttpClientManager instance;
    private OkHttpClient okHttpClient;

    public static OkHttpClientManager getInstance() {
        if (instance == null) {
            synchronized (OkHttpClientManager.class) {
                if (instance == null) {
                    instance = new OkHttpClientManager();
                }
            }
        }
        return instance;
    }

    private OkHttpClientManager() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
//        builder.connectTimeout(HttpConfig.DEFAULT_TIME_OUT, TimeUnit.SECONDS);
//        builder.writeTimeout(HttpConfig.DEFAULT_WRITE_TIME, TimeUnit.SECONDS);
//        builder.readTimeout(HttpConfig.DEFAULT_READ_TIME_OUT, TimeUnit.SECONDS);

//        HttpCommonInterceptor commonInterceptor = new HttpCommonInterceptor.Builder()
//                .addHeaderParams("Connection", "close")
//                .build();
//        builder.addInterceptor(commonInterceptor);

//        File cacheFile = getDiskCacheDir();
//        Cache cache = new Cache(cacheFile, 1024 * 1024 * 100); //100Mb

//        CacheControl cacheControl = new CacheControl.Builder()
//                .noCache()
//                .noStore()
//                .build();

//        File file = new File(Environment.getExternalStorageDirectory(), "a_cache");
//        int cacheSize = 10 * 1024 * 1024;// 缓存大小
        HttpLoggingInterceptor.Level level = HttpLoggingInterceptor.Level.BODY;
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                LogUtils.logE("日志拦截器: ", message);
            }
        });
        loggingInterceptor.setLevel(level);
        builder.addInterceptor(loggingInterceptor);
        okHttpClient = builder
//                .addInterceptor(new Interceptor() {
//                    @Override
//                    public Response intercept(Chain chain) throws IOException {
//                        Request.Builder builder2 = chain.request().newBuilder();
//                        builder2.cacheControl(CacheControl.FORCE_NETWORK);
//                        Response proceed = chain.proceed(builder2.build());
//                        return proceed;
//                    }
//                })
//                .cache(new Cache(file, cacheSize)) // 配置缓存
                .build();
    }

    OkHttpClient getOkHttpClient() {
        return okHttpClient;
    }
}
