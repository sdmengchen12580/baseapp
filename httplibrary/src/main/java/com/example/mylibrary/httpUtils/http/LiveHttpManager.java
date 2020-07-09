package com.example.mylibrary.httpUtils.http;


public class LiveHttpManager {

    //内部测试
//    public static String BaseHttpUrl = "http://test.api.ylqzb.com/index.php/v1/";
    //测试
//    public static String BaseHttpUrl = "http://local.api.yu6.live/index.php/v1/";
    //线上
    public static String BaseHttpUrl = "https://api.ylqzb.com/index.php/v1/";
    //支付
    public static String BasePayHttpUrl = "https://pay.ylqzb.com/index.php/v1/";

    private static volatile LiveHttpManager sInstance;

    private LiveHttpManager() {
    }

    public static LiveHttpManager instance() {
        if (sInstance == null) {
            synchronized (LiveHttpManager.class) {
                if (sInstance == null) {
                    sInstance = new LiveHttpManager();
                }
            }
        }
        return sInstance;
    }
}
