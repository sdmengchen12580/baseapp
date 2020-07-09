package com.example.mylibrary.httpUtils.http.Pay;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;
import com.example.mylibrary.httpUtils.http.user.UserinfoApi;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class PayLoader {

    private PayApi payApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BasePayHttpUrl;

    public PayLoader(String baseUrl) {
        payApi = RetrofitManager.getApi(PayApi.class, baseUrl);
    }

    //1.发起支付宝支付
    private Subscription alipay;

    public Subscription alipay(String app_version,
                                  String app_type,
                                  String timestamp,
                                  String randomstr,
                                  String sign,
                                  String token,
                                  String id,
                                  HttpListener httpListener) {
        alipay = payApi.alipay(app_version, app_type, timestamp, randomstr, sign, token, id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return alipay;
    }

    //2.发起微信支付
    private Subscription wxpay;

    public Subscription wxpay(String app_version,
                               String app_type,
                               String timestamp,
                               String randomstr,
                               String sign,
                               String token,
                               String id,
                               HttpListener httpListener) {
        wxpay = payApi.wxpay(app_version, app_type, timestamp, randomstr, sign, token, id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return wxpay;
    }
}
