package com.example.mylibrary.httpUtils.http.search;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class SearchLoader {

    private SearchApi searchApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public SearchLoader(String baseUrl) {
        searchApi = RetrofitManager.getApi(SearchApi.class, baseUrl);
    }

    //1.搜索正在直播
    private Subscription get_search_livelist;

    public Subscription get_search_livelist(String app_version,
                                               String app_type,
                                               String timestamp,
                                               String randomstr,
                                               String sign,
                                               String token,
                                               String page,
                                               String keyword,
                                               HttpListener httpListener) {
        get_search_livelist = searchApi.get_search_livelist(app_version, app_type, timestamp, randomstr, sign, token, page, keyword)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_search_livelist;
    }
}
