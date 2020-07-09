package com.example.mylibrary.httpUtils.http.Host;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class HostLoader {

    private HostApi hostApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public HostLoader(String baseUrl) {
        hostApi = RetrofitManager.getApi(HostApi.class, baseUrl);
    }

    //1.添加删除黑名单
    private Subscription set_blacklist;

    public Subscription set_blacklist(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String u_id1,
                                      String type,
                                      HttpListener httpListener) {
        set_blacklist = hostApi.set_blacklist(app_version, app_type, timestamp, randomstr, sign, token, u_id1, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return set_blacklist;
    }

    //2.主播间本场鱼钻贡（钻石）献排行榜
    private Subscription get_diamond_hostroom_ranking;

    public Subscription get_diamond_hostroom_ranking(String app_version,
                                                     String app_type,
                                                     String timestamp,
                                                     String randomstr,
                                                     String sign,
                                                     String token,
                                                     String log_id,
                                                     HttpListener httpListener) {
        get_diamond_hostroom_ranking = hostApi.get_diamond_hostroom_ranking(app_version, app_type, timestamp, randomstr, sign, token, log_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_diamond_hostroom_ranking;
    }

    //3.主播间本场鱼币（积分）贡献排行榜
    private Subscription get_integral_hostroom_ranking;

    public Subscription get_integral_hostroom_ranking(String app_version,
                                                      String app_type,
                                                      String timestamp,
                                                      String randomstr,
                                                      String sign,
                                                      String token,
                                                      String log_id,
                                                      HttpListener httpListener) {
        get_integral_hostroom_ranking = hostApi.get_integral_hostroom_ranking(app_version, app_type, timestamp, randomstr, sign, token, log_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_integral_hostroom_ranking;
    }

    //4.主播添加房管
    private Subscription set_host_room_admin;

    public Subscription set_host_room_admin(String app_version,
                                            String app_type,
                                            String timestamp,
                                            String randomstr,
                                            String sign,
                                            String token,
                                            String u_id1,
                                            String type,
                                            HttpListener httpListener) {
        set_host_room_admin = hostApi.set_host_room_admin(app_version, app_type, timestamp, randomstr, sign, token, u_id1, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return set_host_room_admin;
    }

}
