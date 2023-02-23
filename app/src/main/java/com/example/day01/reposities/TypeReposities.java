package com.example.day01.reposities;

import androidx.lifecycle.MutableLiveData;

import com.example.day01.entity.GoodsTypeEntity;
import com.example.day01.model.BaseModel;

public class TypeReposities extends BaseModel {

    public MutableLiveData<GoodsTypeEntity> getType(){
        MutableLiveData<GoodsTypeEntity> data = new MutableLiveData<>();
        return obsere(getApi().getType(),data);
    }


}
