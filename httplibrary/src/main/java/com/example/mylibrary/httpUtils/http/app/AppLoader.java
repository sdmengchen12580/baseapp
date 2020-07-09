package com.example.mylibrary.httpUtils.http.app;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class AppLoader {

    private AppApi appApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public AppLoader(String baseUrl) {
        appApi = RetrofitManager.getApi(AppApi.class, baseUrl);
    }

    //1.热门动态列表
    private Subscription get_report_type_list;

    public Subscription get_report_type_list(String app_version,
                                             String app_type,
                                             String timestamp,
                                             String randomstr,
                                             String sign,
                                             HttpListener httpListener) {
        get_report_type_list = appApi.get_report_type_list(app_version, app_type, timestamp, randomstr, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_report_type_list;
    }


    //2.举报
    private Subscription add_report;

    public Subscription add_report(String app_version,
                                   String app_type,
                                   String timestamp,
                                   String randomstr,
                                   String sign,
                                   String token,
                                   String type,
                                   String type_id,
                                   String pic_data,
                                   String object_id,
                                   HttpListener httpListener) {
        add_report = appApi.add_report(app_version, app_type, timestamp, randomstr, sign, token, type, type_id, pic_data, object_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return add_report;
    }

    //3.协议连接列表
    private Subscription get_agreement_list;

    public Subscription get_agreement_list(String app_version,
                                   String app_type,
                                   String timestamp,
                                   String randomstr,
                                   String sign,
                                   HttpListener httpListener) {
        get_agreement_list = appApi.get_agreement_list(app_version, app_type, timestamp, randomstr, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_agreement_list;
    }

    //4. 充值钻石商品列表
    private Subscription get_recharge_package;

    public Subscription get_recharge_package(String app_version,
                                             String app_type,
                                             String timestamp,
                                             String randomstr,
                                             String sign,
                                             HttpListener httpListener) {
        get_recharge_package = appApi.get_recharge_package(app_version, app_type, timestamp, randomstr, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_recharge_package;
    }

}
