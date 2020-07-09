package com.example.mylibrary.httpUtils.http.gift;

import com.example.mylibrary.httpUtils.http.gift.bean.GetGiftlist;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface GiftApi {

    //1.获取礼物列表
    @POST("Gift/get_giftlist")
    Observable<GetGiftlist> get_giftlist(@Query("app_version") String app_version,
                                          @Query("app_type") String app_type,
                                          @Query("timestamp") String timestamp,
                                          @Query("randomstr") String randomstr,
                                          @Query("sign") String sign);

}
