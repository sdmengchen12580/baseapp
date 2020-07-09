package com.example.mylibrary.httpUtils.http.Host;

import com.example.mylibrary.httpUtils.http.Host.bean.GetDiamondHostroomRanking;
import com.example.mylibrary.httpUtils.http.Host.bean.GetIntegralHostroomRanking;
import com.example.mylibrary.httpUtils.http.Host.bean.SetBlacklist;
import com.example.mylibrary.httpUtils.http.Host.bean.SetHostRoomAdmin;

import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface HostApi {

    //1.添加删除黑名单
    @POST("Userinfo/set_blacklist")
    Observable<SetBlacklist> set_blacklist(@Query("app_version") String app_version,
                                           @Query("app_type") String app_type,
                                           @Query("timestamp") String timestamp,
                                           @Query("randomstr") String randomstr,
                                           @Query("sign") String sign,
                                           @Query("token") String token,
                                           @Query("u_id1") String u_id1,
                                           @Query("type") String type);

    //2.主播间本场鱼钻贡（钻石）献排行榜
    @POST("Host/get_diamond_hostroom_ranking")
    Observable<GetDiamondHostroomRanking> get_diamond_hostroom_ranking(@Query("app_version") String app_version,
                                                                       @Query("app_type") String app_type,
                                                                       @Query("timestamp") String timestamp,
                                                                       @Query("randomstr") String randomstr,
                                                                       @Query("sign") String sign,
                                                                       @Query("token") String token,
                                                                       @Query("log_id") String log_id);

    //3.主播间本场鱼币（积分）贡献排行榜
    @POST("Host/get_integral_hostroom_ranking")
    Observable<GetIntegralHostroomRanking> get_integral_hostroom_ranking(@Query("app_version") String app_version,
                                                                         @Query("app_type") String app_type,
                                                                         @Query("timestamp") String timestamp,
                                                                         @Query("randomstr") String randomstr,
                                                                         @Query("sign") String sign,
                                                                         @Query("token") String token,
                                                                         @Query("log_id") String log_id);

    //4.主播添加房管
    @POST("Host/set_host_room_admin")
    Observable<SetHostRoomAdmin> set_host_room_admin(@Query("app_version") String app_version,
                                                     @Query("app_type") String app_type,
                                                     @Query("timestamp") String timestamp,
                                                     @Query("randomstr") String randomstr,
                                                     @Query("sign") String sign,
                                                     @Query("token") String token,
                                                     @Query("u_id1") String u_id1,
                                                     @Query("type") String type);

}
