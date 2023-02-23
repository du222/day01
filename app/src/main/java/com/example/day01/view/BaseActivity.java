package com.example.day01.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModelProvider;

import com.example.day01.viewmodel.BaseViewModel;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class BaseActivity<VM extends BaseViewModel,VDB extends ViewDataBinding> extends AppCompatActivity {

    protected VM vm;
    protected VDB binding;
    protected abstract int layoutID();
    protected abstract void progressData();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,layoutID());
        createVM();
        progressData();
    }

    public void createVM(){

        if(vm == null){
            Class mClass;
            Type type = getClass().getGenericSuperclass();
            if(type instanceof ParameterizedType){
                mClass = (Class) ((ParameterizedType)type).getActualTypeArguments()[0];
            }else{
                mClass = BaseViewModel.class;

            }

            vm = (VM) new ViewModelProvider(this).get(mClass);
        }
    };


}
