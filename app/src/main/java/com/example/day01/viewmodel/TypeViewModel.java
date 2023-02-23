package com.example.day01.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.example.day01.reposities.TypeReposities;

public class TypeViewModel extends BaseViewModel{

    TypeReposities typeRepo = new TypeReposities();

    public TypeViewModel(@NonNull Application application) {
        super(application);
    }

}
