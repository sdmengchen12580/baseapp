package com.example.mylibrary.httpUtils.http.live;


import com.example.mylibrary.httpUtils.RetrofitManager;
import com.example.mylibrary.httpUtils.callback.HttpListener;
import com.example.mylibrary.httpUtils.http.LiveHttpManager;
import com.example.mylibrary.httpUtils.http.live.bean.HostroomUserInfo;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public class LiverLoader {

    private LiverApi liverApi;

    //接口地址
    public static final String BASEURL = LiveHttpManager.BaseHttpUrl;

    public LiverLoader(String baseUrl) {
        liverApi = RetrofitManager.getApi(LiverApi.class, baseUrl);
    }

    //1.直播间查询个人信息
    private Subscription hostroom_user_info;

    public Subscription hostroom_user_info(String app_version,
                                           String app_type,
                                           String timestamp,
                                           String randomstr,
                                           String sign,
                                           String token,
                                           String host_u_id,
                                           String u_id1,
                                           HttpListener httpListener) {
        hostroom_user_info = liverApi.hostroom_user_info(app_version, app_type, timestamp, randomstr, sign, token, host_u_id, u_id1)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return hostroom_user_info;
    }

    //2.结束直播
    private Subscription stop_hostroom;

    public Subscription stop_hostroom(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      HttpListener httpListener) {
        stop_hostroom = liverApi.stop_hostroom(app_version, app_type, timestamp, randomstr, sign, token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return stop_hostroom;
    }

    //3.查询直播间在线用户列表
    private Subscription get_hostroom_userlist;

    public Subscription get_hostroom_userlist(String app_version,
                                              String app_type,
                                              String timestamp,
                                              String randomstr,
                                              String sign,
                                              String token,
                                              String host_u_id,
                                              HttpListener httpListener) {
        get_hostroom_userlist = liverApi.get_hostroom_userlist(app_version, app_type, timestamp, randomstr, sign, token, host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_hostroom_userlist;
    }

    //4.用户进入直播间
    private Subscription enter_host_room;

    public Subscription enter_host_room(String app_version,
                                        String app_type,
                                        String timestamp,
                                        String randomstr,
                                        String sign,
                                        String token,
                                        String host_u_id,
                                        String is_send_enter_msg,
                                        HttpListener httpListener) {
        enter_host_room = liverApi.enter_host_room(app_version, app_type, timestamp, randomstr, sign, token, host_u_id,is_send_enter_msg)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return enter_host_room;
    }

    //5.用户退出直播间
    private Subscription exit_hostroom;

    public Subscription exit_hostroom(String app_version,
                                      String app_type,
                                      String timestamp,
                                      String randomstr,
                                      String sign,
                                      String token,
                                      String host_u_id,
                                      HttpListener httpListener) {
        exit_hostroom = liverApi.exit_hostroom(app_version, app_type, timestamp, randomstr, sign, token, host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return exit_hostroom;
    }


    //6.主播关播获取主播信息
    private Subscription get_close_hostroom_info;

    public Subscription get_close_hostroom_info(String app_version,
                                                String app_type,
                                                String timestamp,
                                                String randomstr,
                                                String sign,
                                                String token,
                                                String host_u_id,
                                                HttpListener httpListener) {
        get_close_hostroom_info = liverApi.get_close_hostroom_info(app_version, app_type, timestamp, randomstr, sign, token, host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_close_hostroom_info;
    }

    //7.直播间关注主播
    private Subscription add_follow_hostroomo;

    public Subscription add_follow_hostroomo(String app_version,
                                             String app_type,
                                             String timestamp,
                                             String randomstr,
                                             String sign,
                                             String token,
                                             String host_u_id,
                                             HttpListener httpListener) {
        add_follow_hostroomo = liverApi.add_follow_hostroomo(app_version, app_type, timestamp, randomstr, sign, token, host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return add_follow_hostroomo;
    }

    //8.送礼物 (钻石)
    private Subscription give_diamond_gift;

    public Subscription give_diamond_gift(String app_version,
                                          String app_type,
                                          String timestamp,
                                          String randomstr,
                                          String sign,
                                          String token,
                                          String host_u_id,
                                          String id,
                                          String type,
                                          String count,
                                          String content,
                                          HttpListener httpListener) {
        give_diamond_gift = liverApi.give_diamond_gift(app_version, app_type, timestamp, randomstr, sign, token, host_u_id, id, type, count, content)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return give_diamond_gift;
    }


    //9.送礼物 (积分)
    private Subscription give_integral_gift;

    public Subscription give_integral_gift(String app_version,
                                           String app_type,
                                           String timestamp,
                                           String randomstr,
                                           String sign,
                                           String token,
                                           String host_u_id,
                                           String id,
                                           String count,
                                           HttpListener httpListener) {
        give_integral_gift = liverApi.give_integral_gift(app_version, app_type, timestamp, randomstr, sign, token, host_u_id, id, count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return give_integral_gift;
    }

    //10.加入/解除禁言
    private Subscription edit_nospeak;

    public Subscription edit_nospeak(String app_version,
                                     String app_type,
                                     String timestamp,
                                     String randomstr,
                                     String sign,
                                     String token,
                                     String u_id,
                                     String time,
                                     String host_u_id,
                                     HttpListener httpListener) {
        edit_nospeak = liverApi.edit_nospeak(app_version, app_type, timestamp, randomstr, sign, token, u_id, time,host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return edit_nospeak;
    }

    //11.直播间踢人
    private Subscription out_hostroom;

    public Subscription out_hostroom(String app_version,
                                     String app_type,
                                     String timestamp,
                                     String randomstr,
                                     String sign,
                                     String token,
                                     String u_id,
                                     String host_u_id,
                                     HttpListener httpListener) {
        out_hostroom = liverApi.out_hostroom(app_version, app_type, timestamp, randomstr, sign, token, u_id,host_u_id)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return out_hostroom;
    }

    //12.直播间公告（添加删除）
    private Subscription edit_hostroom_notice;

    public Subscription edit_hostroom_notice(String app_version,
                                     String app_type,
                                     String timestamp,
                                     String randomstr,
                                     String sign,
                                     String token,
                                     String type,
                                     String room_notice,
                                     HttpListener httpListener) {
        edit_hostroom_notice = liverApi.edit_hostroom_notice(app_version, app_type, timestamp, randomstr, sign, token, type,room_notice)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return edit_hostroom_notice;
    }

    //13.首页推荐直播列表
    private Subscription get_livelist;

    public Subscription get_livelist(String app_version,
                                     String app_type,
                                     String timestamp,
                                     String randomstr,
                                     String sign,
                                     String token,
                                     String page,
                                     HttpListener httpListener) {
        get_livelist = liverApi.get_livelist(app_version, app_type, timestamp, randomstr, sign, token, page)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_livelist;
    }

    //14.附近的直播列表
    private Subscription get_nearby_livelist;

    public Subscription get_nearby_livelist(String app_version,
                                            String app_type,
                                            String timestamp,
                                            String randomstr,
                                            String sign,
                                            String token,
                                            String page,
                                            String longitude,
                                            String latitude,
                                            String city_code,
                                            String sex,
                                            HttpListener httpListener) {
        get_nearby_livelist = liverApi.get_nearby_livelist(app_version, app_type, timestamp, randomstr, sign,token, page, longitude, latitude, city_code, sex)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return get_nearby_livelist;
    }

    //15.关注主播（直播中）
    private Subscription follow_live_host;

    public Subscription follow_live_host(String app_version,
                                         String app_type,
                                         String timestamp,
                                         String randomstr,
                                         String sign,
                                         String token,
                                         HttpListener httpListener) {
        follow_live_host = liverApi.follow_live_host(app_version, app_type, timestamp, randomstr, sign,token)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(httpListener);
        return follow_live_host;
    }

}
