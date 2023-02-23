package com.example.day01.http;

import com.example.day01.entity.GoodsTypeEntity;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface Api {

    @GET("goods/category")
    Observable<GoodsTypeEntity> getType();
}
