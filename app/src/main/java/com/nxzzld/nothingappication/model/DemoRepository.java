package com.nxzzld.nothingappication.model;

import com.nxzzld.nothingappication.base.PagingEntity;
import com.nxzzld.nothingappication.net.RetrofitFactory;
import com.nxzzld.nothingappication.net.RxUtil;
import com.nxzzld.nothingappication.net.api.UserApi;
import com.nxzzld.nothingappication.net.api.entity.NewDetailEntity;
import com.nxzzld.nothingappication.net.api.entity.NewsDataEntity;


import io.reactivex.rxjava3.core.Observable;

public class DemoRepository {
    private UserApi api;

    public DemoRepository() {
        api = RetrofitFactory.instance.create(UserApi.class);
    }


    public Observable<PagingEntity<NewsDataEntity>> getNewsList(int page, String id) {
        return api.getNewsList(page, 10, id)
                .compose(RxUtil.io_main())
                .compose(RxUtil.handleResult());
    }

    public Observable<NewDetailEntity> getNewsDetail(String id) {
        return api.getNewsDetail(id)
                .compose(RxUtil.io_main())
                .compose(RxUtil.handleResult());
    }

}
