package com.example.day01.http;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitManager {


    private RetrofitManager(){}

    private static RetrofitManager retrofitManager;

    public synchronized static RetrofitManager getInstance(){
        if(retrofitManager == null){
            retrofitManager = new RetrofitManager();
        }
        return retrofitManager;
    }

    private Retrofit mRetrofit;
    public  Retrofit getRetrofit(){

        if(mRetrofit == null){

            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                    .build();
            mRetrofit = new Retrofit.Builder()
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://43.143.146.165:7777/")
                    .client(client)
                    .build();
        }
        return  mRetrofit;
    }
}
