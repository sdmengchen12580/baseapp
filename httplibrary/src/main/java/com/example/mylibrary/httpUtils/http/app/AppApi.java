package com.example.mylibrary.httpUtils.http.app;

import com.example.mylibrary.httpUtils.http.app.bean.AddRport;
import com.example.mylibrary.httpUtils.http.app.bean.GetAgreementList;
import com.example.mylibrary.httpUtils.http.app.bean.GetRechargePackage;
import com.example.mylibrary.httpUtils.http.app.bean.GetReportTypeLst;

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

public interface AppApi {

    //1.意见反馈类型列表
    @GET("App/get_report_type_list")
    Observable<GetReportTypeLst> get_report_type_list(@Query("app_version") String app_version,
                                                      @Query("app_type") String app_type,
                                                      @Query("timestamp") String timestamp,
                                                      @Query("randomstr") String randomstr,
                                                      @Query("sign") String sign);

    //2.举报
    @FormUrlEncoded
    @Headers("charset:utf-8")
    @POST("App/add_report")
    Observable<AddRport> add_report(@Field("app_version") String app_version,
                                    @Field("app_type") String app_type,
                                    @Field("timestamp") String timestamp,
                                    @Field("randomstr") String randomstr,
                                    @Field("sign") String sign,
                                    @Field("token") String token,
                                    @Field("type") String type,
                                    @Field("type_id") String type_id,
                                    @Field("pic_data") String pic_data,
                                    @Field("object_id") String object_id);

    //3.协议连接列表
    @GET("App/get_agreement_list")
    Observable<GetAgreementList> get_agreement_list(@Query("app_version") String app_version,
                                                    @Query("app_type") String app_type,
                                                    @Query("timestamp") String timestamp,
                                                    @Query("randomstr") String randomstr,
                                                    @Query("sign") String sign);

    //4. 充值钻石商品列表
    @GET("App/get_recharge_package")
    Observable<GetRechargePackage> get_recharge_package(@Query("app_version") String app_version,
                                                        @Query("app_type") String app_type,
                                                        @Query("timestamp") String timestamp,
                                                        @Query("randomstr") String randomstr,
                                                        @Query("sign") String sign);

}
