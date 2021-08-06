package com.nxzzld.nothingappication.net;


import com.nxzzld.nothingappication.base.BaseResponse;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.schedulers.Schedulers;

/**
 * RxJava 工具类
 * <p>
 * Created on 2016/11/1 下午7:32.
 *
 * @author binwin20
 */

public final class RxUtil {
    public static <T> ObservableTransformer<T, T> io_main() {
        return new ObservableTransformer() {

            @Override
            public ObservableSource apply(Observable upstream) {
                return upstream
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static Function<BaseResponse<Object>, BaseResponse<Object>> notNull() {
        return new Function<BaseResponse<Object>, BaseResponse<Object>>() {
            @Override
            public BaseResponse<Object> apply(BaseResponse<Object> response) throws Throwable {
                if (response.getData() == null) {
                    response.setData(new Object());
                }
                return response;
            }
        };
    }

    public static <T> ObservableTransformer<BaseResponse<T>, T> handleResult() {
        return new ObservableTransformer<BaseResponse<T>, T>() {

            @Override
            public @NonNull ObservableSource<T> apply(@NonNull Observable<BaseResponse<T>> upstream) {
                return upstream.flatMap(
                        new Function<BaseResponse<T>, ObservableSource<? extends T>>() {
                            @Override
                            public ObservableSource<? extends T> apply(BaseResponse<T> result) {
                                if (result.getCode() == BaseResponse.SUCCESS) {
                                    if ("".equals(result.getErrorCode())) {
                                        return Observable.just(result.getData());

                                    } else {
                                        return Observable.error(new BusinessException(result.getErrorCode(), result.getMessage()));
                                    }
                                } else {
                                    return Observable.error(new RequestException(result.getCode(), result.getMessage()));
                                }
                            }
                        }
                );
            }
        };
    }

/*
    private static Observable.Transformer<Object, Object> sApplyTransformer =
            observable -> observable.throttleFirst(500, TimeUnit.MILLISECONDS)
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());

    private static Observable.Transformer<Object, Object> sSaveTransformer =
            observable -> observable.observeOn(Schedulers.io());


    *//**
     * 在 IO 线程执行数据操作，UI线程执行订阅操作
     * <p>
     * 效果等同于：
     * <p>
     * Observable.just().subscribeOn(Schedules.io()).observableOn(AndroidSchedulers.mainThread()).subscribe();
     * <p>
     * 使用方式：
     * <p>
     * Observable.just().compose(RxUtils.applySchedulers()).subscribe();
     *
     * @return
     *//*
    public static <T> Observable.Transformer<T, T> applySchedulers() {
        return (Observable.Transformer<T, T>) sApplyTransformer;
    }

    *//**
     * 在 IO 线程执行订阅操作
     * <p>
     * 效果等同于：
     * <p>
     * Observable.just().observableOn(Schedules.io()).subscribe();
     * <p>
     * 使用方式：
     * <p>
     * Observable.just().compose(RxUtils.saveSchedulers()).subscribe();
     *//*
    public static <T> Observable.Transformer<T, T> saveSchedulers() {
        return (Observable.Transformer<T, T>) sSaveTransformer;
    }

    *//**
     * @return Schedulers.io();
     *//*
    public static Scheduler ioThread() {
        return Schedulers.io();
    }

    *//**
     * @return AndroidSchedulers.mainThread();
     *//*
    public static Scheduler mainThread() {
        return AndroidSchedulers.mainThread();
    }

    *//**
     * 文件下载转换工具，如果文件不存在，会创建文件；已存在，则被替换
     * <p>
     * 定义 retrofit 接口<br>
     * (@)Streaming (@)GET("https://github.com/binwin20/my.apk")<br>
     * Observable&lt;ResponseBody&gt; downloadFile();
     * <p>
     * 使用方式<br>
     * Api.downloadFile()<br>
     * .flatMap(RxUtils.downloadFlapMap(file))<br>
     * .compose(RxUtils.applySchedulers())<br>
     * .subscribe(progress -> showProgress(progress));
     *
     * @param saveFile 保存文件的地址
     * @return
     *//*
    public static Function1<? super ResponseBody, ? extends Observable<Integer>> downloadFlapMap(File saveFile) {
        return responseBody -> Observable.create((Observable.OnSubscribe<Integer>) subscriber ->
                writeResponseBodyToDisk(responseBody, saveFile, subscriber))
                .compose(RxUtil.applySchedulers());  // 必须加上这个，否则报错 rx.exceptions.MissingBackpressureException
    }

    private static void writeResponseBodyToDisk(ResponseBody body, File file, Subscriber<? super Integer> subscriber) {
        Throwable throwable = null;
        try {

            InputStream inputStream = null;
            OutputStream outputStream = null;
            long lastTime = System.currentTimeMillis();

            try {
                byte[] fileReader = new byte[4096];
                long fileSize = body.contentLength();
                long fileSizeDownloaded = 0;

                inputStream = body.byteStream();
                outputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(fileReader);
                    if (read == -1) {
                        break;
                    }

                    outputStream.write(fileReader, 0, read);
                    fileSizeDownloaded += read;
                    if (System.currentTimeMillis() - lastTime > 200) {
                        lastTime = System.currentTimeMillis();
                        subscriber.onNext((int) (fileSizeDownloaded * 100 / fileSize));
                    }
                }
                outputStream.flush();
            } catch (IOException e) {
                throwable = e;
            } finally {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (outputStream != null) {
                    outputStream.close();
                }
            }
        } catch (IOException e) {
            throwable = e;
        } finally {
            if (throwable == null) {
                subscriber.onCompleted();
            } else {
                subscriber.onError(throwable);
            }
        }
    }*/
}
