package com.nxzzld.nothingappication.model.news_detail;

import androidx.lifecycle.MutableLiveData;

import com.nxzzld.nothingappication.base.BaseViewModel;
import com.nxzzld.nothingappication.model.DemoRepository;
import com.nxzzld.nothingappication.net.RxObserver;
import com.nxzzld.nothingappication.net.api.entity.NewDetailEntity;

public class NewsDetailModel extends BaseViewModel {
    private DemoRepository repository = new DemoRepository();

    public MutableLiveData<NewDetailEntity> data = new MutableLiveData<>();

    public void getNewsDetail(String id) {
        repository.getNewsDetail(id)
                .subscribe(new RxObserver<NewDetailEntity>() {
                    @Override
                    public void _onNext(NewDetailEntity responseActivityDetail) {
                        data.setValue(responseActivityDetail);
                    }

                    @Override
                    public void _onError(String code, String msg) {
                        error.setValue(msg);
                    }
                });
    }
}
