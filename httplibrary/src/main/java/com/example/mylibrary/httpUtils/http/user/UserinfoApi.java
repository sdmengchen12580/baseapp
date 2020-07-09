package com.example.mylibrary.httpUtils.http.user;

import com.example.mylibrary.httpUtils.http.user.bean.AddFollowBean;
import com.example.mylibrary.httpUtils.http.user.bean.CancelFollow;
import com.example.mylibrary.httpUtils.http.user.bean.EditUserinfo;
import com.example.mylibrary.httpUtils.http.user.bean.GetAllUserinfo;
import com.example.mylibrary.httpUtils.http.user.bean.GetBlacklist;
import com.example.mylibrary.httpUtils.http.user.bean.GetCertificationInfo;
import com.example.mylibrary.httpUtils.http.user.bean.GetFollowFansList;
import com.example.mylibrary.httpUtils.http.user.bean.GetUserHostExperienceList;
import com.example.mylibrary.httpUtils.http.user.bean.SetBlacklist;
import com.example.mylibrary.httpUtils.http.user.bean.UserInfo;

import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface UserinfoApi {

    //1.直播间查询个人信息
    @POST("Userinfo/user_info")
    Observable<UserInfo> user_info(@Query("app_version") String app_version,
                                   @Query("app_type") String app_type,
                                   @Query("timestamp") String timestamp,
                                   @Query("randomstr") String randomstr,
                                   @Query("sign") String sign,
                                   @Query("token") String token,
                                   @Query("u_id1") String u_id1);

    //2.取消关注
    @POST("Userinfo/cancel_follow")
    Observable<CancelFollow> cancel_follow(@Query("app_version") String app_version,
                                           @Query("app_type") String app_type,
                                           @Query("timestamp") String timestamp,
                                           @Query("randomstr") String randomstr,
                                           @Query("sign") String sign,
                                           @Query("token") String token,
                                           @Query("u_id1") String u_id1);

    //3.关注
    @GET("Userinfo/add_follow")
    Observable<AddFollowBean> add_follow(@Query("app_version") String app_version,
                                         @Query("app_type") String app_type,
                                         @Query("timestamp") String timestamp,
                                         @Query("randomstr") String randomstr,
                                         @Query("sign") String sign,
                                         @Query("token") String token,
                                         @Query("u_id_data") String u_id_data);

    //4.黑名单列表
    @GET("Userinfo/get_blacklist")
    Observable<GetBlacklist> get_blacklist(@Query("app_version") String app_version,
                                           @Query("app_type") String app_type,
                                           @Query("timestamp") String timestamp,
                                           @Query("randomstr") String randomstr,
                                           @Query("sign") String sign,
                                           @Query("token") String token,
                                           @Query("page") String page);

    //5.添加删除黑名单
    @GET("Userinfo/set_blacklist")
    Observable<SetBlacklist> set_blacklist(@Query("app_version") String app_version,
                                           @Query("app_type") String app_type,
                                           @Query("timestamp") String timestamp,
                                           @Query("randomstr") String randomstr,
                                           @Query("sign") String sign,
                                           @Query("token") String token,
                                           @Query("u_id1") String u_id1,
                                           @Query("type") String type);

    //6.修改个人资料
    @FormUrlEncoded
    @Headers("charset:utf-8")
    @POST("Userinfo/edit_userinfo")
    Observable<EditUserinfo> edit_userinfo(@Field("app_version") String app_version,
                                           @Field("app_type") String app_type,
                                           @Field("timestamp") String timestamp,
                                           @Field("randomstr") String randomstr,
                                           @Field("sign") String sign,
                                           @Field("token") String token,
                                           @Field("type") String type,
                                           @Field("content") String content);

    //7.关注/粉丝列表
    @GET("Userinfo/get_follow_fans_list")
    Observable<GetFollowFansList> get_follow_fans_list(@Query("app_version") String app_version,
                                                       @Query("app_type") String app_type,
                                                       @Query("timestamp") String timestamp,
                                                       @Query("randomstr") String randomstr,
                                                       @Query("sign") String sign,
                                                       @Query("token") String token,
                                                       @Query("page") String page,
                                                       @Query("type") String type);

    //8.经验列表
    @GET("Userinfo/get_user_host_experience_list")
    Observable<GetUserHostExperienceList> get_user_host_experience_list(@Query("app_version") String app_version,
                                                                        @Query("app_type") String app_type,
                                                                        @Query("timestamp") String timestamp,
                                                                        @Query("randomstr") String randomstr,
                                                                        @Query("sign") String sign,
                                                                        @Query("token") String token,
                                                                        @Query("type") String type);

    //9.实名认证信息
    @GET("Userinfo/get_certification_info")
    Observable<GetCertificationInfo> get_certification_info(@Query("app_version") String app_version,
                                                            @Query("app_type") String app_type,
                                                            @Query("timestamp") String timestamp,
                                                            @Query("randomstr") String randomstr,
                                                            @Query("sign") String sign,
                                                            @Query("token") String token);

    //10.查询融云头像
    @POST("Userinfo/get_all_userinfo")
    Observable<GetAllUserinfo> get_all_userinfo(@Query("app_version") String app_version,
                                                @Query("app_type") String app_type,
                                                @Query("timestamp") String timestamp,
                                                @Query("randomstr") String randomstr,
                                                @Query("sign") String sign,
                                                @Query("token") String token,
                                                @Query("u_id_data") String u_id_data);
}

