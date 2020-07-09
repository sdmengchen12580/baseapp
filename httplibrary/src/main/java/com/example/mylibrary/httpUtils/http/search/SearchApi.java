package com.example.mylibrary.httpUtils.http.search;

import com.example.mylibrary.httpUtils.http.search.bean.GetSearchLivelist;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;


/**
 * Created by 孟晨 on 2018/7/29.
 */

public interface SearchApi {

    //1.搜索正在直播
    @POST("Search/get_search_livelist")
    Observable<GetSearchLivelist> get_search_livelist(@Query("app_version") String app_version,
                                                      @Query("app_type") String app_type,
                                                      @Query("timestamp") String timestamp,
                                                      @Query("randomstr") String randomstr,
                                                      @Query("sign") String sign,
                                                      @Query("token") String token,
                                                      @Query("page") String page,
                                                      @Query("keyword") String keyword);


}
