package com.nxzzld.nothingappication.net;

import android.content.Context;

import com.nxzzld.nothingappication.common.Constant;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitFactory {
    public static RetrofitFactory instance = new RetrofitFactory();

    private Retrofit mRetrofit;
    private Interceptor mInterceptor;

    public <T> T create(Class<T> service, Context context) {
        return mRetrofit.create(service);
    }

    public <T> T create(Class<T> service) {
        return mRetrofit.create(service);
    }

    private RetrofitFactory() {
        mInterceptor = new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {

                Headers newHeaders = chain.request().headers().newBuilder()
                        .add("Content-Type", "application/json")
                        .add("charset", "utf-8")
                        .add("Authorization", "Bearer " + LocalStorage.getToken())
                        .build();

                Request request = chain.request().newBuilder().headers(newHeaders).build();
                Response response = null;
                response = chain.proceed(request);
                return response;
            }

        };
        mRetrofit = new Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
                .client(initClient())
                .build();
    }

    private OkHttpClient initClient() {

        return new OkHttpClient.Builder()
                .addInterceptor(mInterceptor)
                .addInterceptor(initLogInterceptor())
                .callTimeout(30, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    private Interceptor initLogInterceptor() {
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }


}
