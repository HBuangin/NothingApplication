package com.nxzzld.nothingappication.model.news_list;

import com.nxzzld.nothingappication.base.CommonListViewModel;
import com.nxzzld.nothingappication.base.PagingEntity;
import com.nxzzld.nothingappication.model.DemoRepository;
import com.nxzzld.nothingappication.net.RxObserver;
import com.nxzzld.nothingappication.net.api.entity.NewsDataEntity;

public class ListDemoModel extends CommonListViewModel<NewsDataEntity> {

    private DemoRepository repository = new DemoRepository();

    public void getNewsList(boolean isRefresh,String id) {
        emitUIState(true, null, null, false, isRefresh, false);

        if (isRefresh) setCurrentPage(1);

        repository.getNewsList( getCurrentPage(),id)
                .subscribe(new RxObserver<PagingEntity<NewsDataEntity>>() {
                    @Override
                    public void _onNext(PagingEntity<NewsDataEntity> activityListEntityPagingEntity) {
                        dealPaging(isRefresh, activityListEntityPagingEntity);
                    }

                    @Override
                    public void _onError(String code, String msg) {
                        emitUIState(false, msg, null, false, isRefresh, false);
                    }
                });
    }
}
