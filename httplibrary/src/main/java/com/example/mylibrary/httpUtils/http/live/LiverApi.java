package com.example.mylibrary.httpUtils.http.live;


import com.example.mylibrary.httpUtils.http.live.bean.AddFollowHostroomo;
import com.example.mylibrary.httpUtils.http.live.bean.EditHostroomNotice;
import com.example.mylibrary.httpUtils.http.live.bean.EditNospeak;
import com.example.mylibrary.httpUtils.http.live.bean.EnterHostRoom;
import com.example.mylibrary.httpUtils.http.live.bean.ExitHostroom;
import com.example.mylibrary.httpUtils.http.live.bean.FollowLiveHost;
import com.example.mylibrary.httpUtils.http.live.bean.GetCloseHostroomInfo;
import com.example.mylibrary.httpUtils.http.live.bean.GetHostroomUserlist;
import com.example.mylibrary.httpUtils.http.live.bean.GetLivelist;
import com.example.mylibrary.httpUtils.http.live.bean.GetNearbyLivelist;
import com.example.mylibrary.httpUtils.http.live.bean.GiveDiamondGift;
import com.example.mylibrary.httpUtils.http.live.bean.GiveIntegralGift;
import com.example.mylibrary.httpUtils.http.live.bean.HostroomUserInfo;
import com.example.mylibrary.httpUtils.http.live.bean.OutHostroom;
import com.example.mylibrary.httpUtils.http.live.bean.StopHstroom;

import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface LiverApi {


    //1.直播间查询个人信息
    @POST("Live/hostroom_user_info")
    Observable<HostroomUserInfo> hostroom_user_info(@Query("app_version") String app_version,
                                                    @Query("app_type") String app_type,
                                                    @Query("timestamp") String timestamp,
                                                    @Query("randomstr") String randomstr,
                                                    @Query("sign") String sign,
                                                    @Query("token") String token,
                                                    @Query("host_u_id") String host_u_id,
                                                    @Query("u_id1") String u_id1);

    //2.结束直播
    @POST("Live/stop_hostroom")
    Observable<StopHstroom> stop_hostroom(@Query("app_version") String app_version,
                                          @Query("app_type") String app_type,
                                          @Query("timestamp") String timestamp,
                                          @Query("randomstr") String randomstr,
                                          @Query("sign") String sign,
                                          @Query("token") String token);

    //3.查询直播间在线用户列表
    @POST("Live/get_hostroom_userlist")
    Observable<GetHostroomUserlist> get_hostroom_userlist(@Query("app_version") String app_version,
                                                          @Query("app_type") String app_type,
                                                          @Query("timestamp") String timestamp,
                                                          @Query("randomstr") String randomstr,
                                                          @Query("sign") String sign,
                                                          @Query("token") String token,
                                                          @Query("host_u_id") String host_u_id);

    //4.用户进入直播间
    @POST("Live/enter_host_room")
    Observable<EnterHostRoom> enter_host_room(@Query("app_version") String app_version,
                                              @Query("app_type") String app_type,
                                              @Query("timestamp") String timestamp,
                                              @Query("randomstr") String randomstr,
                                              @Query("sign") String sign,
                                              @Query("token") String token,
                                              @Query("host_u_id") String host_u_id,
                                              @Query("is_send_enter_msg") String is_send_enter_msg);

    //5.用户退出直播间
    @POST("Live/exit_hostroom")
    Observable<ExitHostroom> exit_hostroom(@Query("app_version") String app_version,
                                           @Query("app_type") String app_type,
                                           @Query("timestamp") String timestamp,
                                           @Query("randomstr") String randomstr,
                                           @Query("sign") String sign,
                                           @Query("token") String token,
                                           @Query("host_u_id") String host_u_id);

    //6.主播关播获取主播信息
    @POST("Live/get_close_hostroom_info")
    Observable<GetCloseHostroomInfo> get_close_hostroom_info(@Query("app_version") String app_version,
                                                             @Query("app_type") String app_type,
                                                             @Query("timestamp") String timestamp,
                                                             @Query("randomstr") String randomstr,
                                                             @Query("sign") String sign,
                                                             @Query("token") String token,
                                                             @Query("host_u_id") String host_u_id);

    //7.直播间关注主播
    @POST("Live/add_follow_hostroom")
    Observable<AddFollowHostroomo> add_follow_hostroomo(@Query("app_version") String app_version,
                                                        @Query("app_type") String app_type,
                                                        @Query("timestamp") String timestamp,
                                                        @Query("randomstr") String randomstr,
                                                        @Query("sign") String sign,
                                                        @Query("token") String token,
                                                        @Query("host_u_id") String host_u_id);

    //8.送礼物 (钻石)
    @POST("Gift/give_diamond_gift")
    Observable<GiveDiamondGift> give_diamond_gift(@Query("app_version") String app_version,
                                                  @Query("app_type") String app_type,
                                                  @Query("timestamp") String timestamp,
                                                  @Query("randomstr") String randomstr,
                                                  @Query("sign") String sign,
                                                  @Query("token") String token,
                                                  @Query("host_u_id") String host_u_id,
                                                  @Query("id") String id,
                                                  @Query("type") String type,
                                                  @Query("count") String count,
                                                  @Query("content") String content);

    //9.送礼物 (积分)
    @POST("Gift/give_integral_gift")
    Observable<GiveIntegralGift> give_integral_gift(@Query("app_version") String app_version,
                                                    @Query("app_type") String app_type,
                                                    @Query("timestamp") String timestamp,
                                                    @Query("randomstr") String randomstr,
                                                    @Query("sign") String sign,
                                                    @Query("token") String token,
                                                    @Query("host_u_id") String host_u_id,
                                                    @Query("id") String id,
                                                    @Query("count") String count);

    //10.加入/解除禁言
    @POST("Live/edit_nospeak")
    Observable<EditNospeak> edit_nospeak(@Query("app_version") String app_version,
                                         @Query("app_type") String app_type,
                                         @Query("timestamp") String timestamp,
                                         @Query("randomstr") String randomstr,
                                         @Query("sign") String sign,
                                         @Query("token") String token,
                                         @Query("u_id") String u_id,
                                         @Query("time") String time,
                                         @Query("host_u_id") String host_u_id);

    //11.直播间踢人
    @POST("Live/out_hostroom")
    Observable<OutHostroom> out_hostroom(@Query("app_version") String app_version,
                                         @Query("app_type") String app_type,
                                         @Query("timestamp") String timestamp,
                                         @Query("randomstr") String randomstr,
                                         @Query("sign") String sign,
                                         @Query("token") String token,
                                         @Query("u_id") String u_id,
                                         @Query("host_u_id") String host_u_id);

    //12.直播间公告（添加删除）
    @POST("Live/edit_hostroom_notice")
    Observable<EditHostroomNotice> edit_hostroom_notice(@Query("app_version") String app_version,
                                                        @Query("app_type") String app_type,
                                                        @Query("timestamp") String timestamp,
                                                        @Query("randomstr") String randomstr,
                                                        @Query("sign") String sign,
                                                        @Query("token") String token,
                                                        @Query("type") String type,
                                                        @Query("room_notice") String room_notice);

    //13.首页推荐直播列表
    @POST("Live/get_livelist")
    Observable<GetLivelist> get_livelist(@Query("app_version") String app_version,
                                         @Query("app_type") String app_type,
                                         @Query("timestamp") String timestamp,
                                         @Query("randomstr") String randomstr,
                                         @Query("sign") String sign,
                                         @Query("token") String token,
                                         @Query("page") String page);

    //14.附近的直播列表
    @GET("Live/get_nearby_livelist")
    Observable<GetNearbyLivelist> get_nearby_livelist(@Query("app_version") String app_version,
                                                      @Query("app_type") String app_type,
                                                      @Query("timestamp") String timestamp,
                                                      @Query("randomstr") String randomstr,
                                                      @Query("sign") String sign,
                                                      @Query("token") String token,
                                                      @Query("page") String page,
                                                      @Query("longitude") String longitude,
                                                      @Query("latitude") String latitude,
                                                      @Query("city_code") String city_code,
                                                      @Query("sex") String sex);

    //15.关注主播（直播中）
    @GET("Live/follow_live_host")
    Observable<FollowLiveHost> follow_live_host(@Query("app_version") String app_version,
                                                @Query("app_type") String app_type,
                                                @Query("timestamp") String timestamp,
                                                @Query("randomstr") String randomstr,
                                                @Query("sign") String sign,
                                                @Query("token") String token);

}
