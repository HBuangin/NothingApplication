package com.nxzzld.nothingappication.net.api;


import com.nxzzld.nothingappication.base.PagingEntity;
import com.nxzzld.nothingappication.net.api.entity.NewDetailEntity;
import com.nxzzld.nothingappication.net.api.entity.NewsDataEntity;
import com.nxzzld.nothingappication.net.api.entity.UserEntity;
import com.nxzzld.nothingappication.net.api.request.RequestLogin;
import com.nxzzld.nothingappication.base.BaseResponse;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserApi {
    //登录
    @POST("/api/auth/login")
    @Headers("Content-Type:application/json")
    Observable<BaseResponse<UserEntity>> userLogin(@Body RequestLogin request);

//
//    @GET("/api/space/activity/list")
//    Observable<BaseResponse<PagingEntity<ActivityListEntity>>> getActivityList(
//            @Query("category_id") String category,
//            @Query("search") String search,
//            @Query("page") int page,
//            @Query("pageSize") int pageSize

//    );

    @GET("/api/cms/article/findList")
    Observable<BaseResponse<PagingEntity<NewsDataEntity>>> getNewsList(
            @Query("page") int page,
            @Query("pageSize") int pageSize,
            @Query("category_id") String category_id
            );


    @GET("/api/cms/article/show/{id}")
    Observable<BaseResponse<NewDetailEntity>> getNewsDetail(@Path("id") String id);


}
