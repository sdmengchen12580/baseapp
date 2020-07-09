package com.example.mylibrary.httpUtils.http.Pay;

import com.example.mylibrary.httpUtils.http.Pay.bean.AlipayBean;
import com.example.mylibrary.httpUtils.http.Pay.bean.WxpayBean;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface PayApi {

    //1.发起支付宝支付
    @POST("Pay/alipay")
    Observable<AlipayBean> alipay(@Query("app_version") String app_version,
                                     @Query("app_type") String app_type,
                                     @Query("timestamp") String timestamp,
                                     @Query("randomstr") String randomstr,
                                     @Query("sign") String sign,
                                     @Query("token") String token,
                                     @Query("id") String id);

    //2.发起微信支付
    @POST("Pay/wxpay")
    Observable<WxpayBean> wxpay(@Query("app_version") String app_version,
                                @Query("app_type") String app_type,
                                @Query("timestamp") String timestamp,
                                @Query("randomstr") String randomstr,
                                @Query("sign") String sign,
                                @Query("token") String token,
                                @Query("id") String id);

}
