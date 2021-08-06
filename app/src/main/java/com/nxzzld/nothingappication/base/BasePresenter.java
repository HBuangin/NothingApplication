package com.nxzzld.nothingappication.base;



public class BasePresenter<T extends BaseView> {
    public T mView;

    public BasePresenter(T view) {
        mView = view;
    }
}
