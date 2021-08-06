package com.nxzzld.nothingappication.net;

import android.util.Log;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public abstract class RxObserver<T> implements Observer<T> {
    @Override
    public void onSubscribe(@NonNull Disposable d) {

    }

    @Override
    public void onComplete() {

    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
        String msg;
        String code = "";
        Log.d("DDDDDDDD", "onError:------->> "+throwable);
        if (throwable instanceof RequestException) {
            // 服务器异常
            msg = throwable.getMessage();
        } else if (throwable instanceof UnknownHostException) {
            msg = "网络异常";
        } else if (throwable instanceof SocketTimeoutException) {
            // 超时
            msg = "请求超时";
        } else if (throwable instanceof BusinessException) {
            msg = throwable.getMessage();
            code = ((BusinessException) throwable).getErrorCode();
        } else {
            msg = "未知错误";
        }
        _onError(code, msg);
    }

    @Override
    public void onNext(T t) {
        _onNext(t);
    }


    public abstract void _onNext(T t);

    public abstract void _onError(String code, String msg);
}
