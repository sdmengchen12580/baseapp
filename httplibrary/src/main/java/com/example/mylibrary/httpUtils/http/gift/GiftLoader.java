package com.example.mylibrary.httpUtils.http.gift;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.Host.HostApi;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;
import com.example.mylibrary.httpUtils.http.gift.bean.GetGiftlist;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class GiftLoader {

    private GiftApi giftApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public GiftLoader(String baseUrl) {
        giftApi = RetrofitManager.getApi(GiftApi.class, baseUrl);
    }

    //1.获取礼物列表
    private Subscription get_giftlist;

    public Subscription get_giftlist(String app_version,
                                     String app_type,
                                     String timestamp,
                                     String randomstr,
                                     String sign,
                                     HttpListener httpListener) {
        get_giftlist = giftApi.get_giftlist(app_version, app_type, timestamp, randomstr, sign)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_giftlist;
    }
}
