package com.example.mylibrary.httpUtils.http.user;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;

import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class UserInfoLoader {

    private UserinfoApi userinfoApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public UserInfoLoader(String baseUrl) {
        userinfoApi = RetrofitManager.getApi(UserinfoApi.class, baseUrl);
    }

    //1.直播间查询个人信息
    private Subscription user_info;

    public Subscription user_info(String app_version,
                                  String app_type,
                                  String timestamp,
                                  String randomstr,
                                  String sign,
                                  String token,
                                  String u_id1,
                                  HttpListener httpListener) {
        user_info = userinfoApi.user_info(app_version, app_type, timestamp, randomstr, sign, token, u_id1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return user_info;
    }

    //2.关注
    private Subscription add_follow;

    public Subscription add_follow(String app_version,
                                   String app_type,
                                   String timestamp,
                                   String randomstr,
                                   String sign,
                                   String token,
                                   String u_id_data,
                                   HttpListener httpListener) {
        add_follow = userinfoApi.add_follow(app_version, app_type, timestamp, randomstr, sign, token, u_id_data)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return add_follow;
    }

    //3.取消关注
    private Subscription cancel_follow;

    public Subscription cancel_follow(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String u_id1,
                                      HttpListener httpListener) {
        cancel_follow = userinfoApi.cancel_follow(app_version, app_type, timestamp, randomstr, sign, token, u_id1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return cancel_follow;
    }

    //4.黑名单列表
    private Subscription get_blacklist;

    public Subscription get_blacklist(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String page,
                                      HttpListener httpListener) {
        get_blacklist = userinfoApi.get_blacklist(app_version, app_type, timestamp, randomstr, sign, token, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_blacklist;
    }

    //5.添加删除黑名单
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
        set_blacklist = userinfoApi.set_blacklist(app_version, app_type, timestamp, randomstr, sign, token, u_id1, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return set_blacklist;
    }

    //6.修改个人资料
    private Subscription edit_userinfo;

    public Subscription edit_userinfo(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String type,
                                      String content,
                                      HttpListener httpListener) {
        edit_userinfo = userinfoApi.edit_userinfo(app_version, app_type, timestamp, randomstr, sign, token, type, content)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return edit_userinfo;
    }

    //7.关注/粉丝列表
    private Subscription get_follow_fans_list;

    public Subscription get_follow_fans_list(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String page,
                                      String type,
                                      HttpListener httpListener) {
        get_follow_fans_list = userinfoApi.get_follow_fans_list(app_version, app_type, timestamp, randomstr, sign, token, page, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_follow_fans_list;
    }


    //8.经验列表
    private Subscription get_user_host_experience_list;

    public Subscription get_user_host_experience_list(String app_version,
                                             String app_type,
                                             String timestamp,
                                             String randomstr,
                                             String sign,
                                             String token,
                                             String type,
                                             HttpListener httpListener) {
        get_user_host_experience_list = userinfoApi.get_user_host_experience_list(app_version, app_type, timestamp, randomstr, sign, token, type)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_user_host_experience_list;
    }

    //9.实名认证信息
    private Subscription get_certification_info;

    public Subscription get_certification_info(String app_version,
                                                      String app_type,
                                                      String timestamp,
                                                      String randomstr,
                                                      String sign,
                                                      String token,
                                                      HttpListener httpListener) {
        get_certification_info = userinfoApi.get_certification_info(app_version, app_type, timestamp, randomstr, sign, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_certification_info;
    }

    //10.查询融云头像
    private Subscription get_all_userinfo;

    public Subscription get_all_userinfo(String app_version,
                                         String app_type,
                                         String timestamp,
                                         String randomstr,
                                         String sign,
                                         String token,
                                         String u_id_data,
                                         HttpListener httpListener) {
        get_all_userinfo = userinfoApi.get_all_userinfo(app_version, app_type, timestamp, randomstr, sign, token, u_id_data)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_all_userinfo;
    }

}
