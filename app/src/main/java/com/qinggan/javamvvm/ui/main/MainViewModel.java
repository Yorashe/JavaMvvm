package com.qinggan.javamvvm.ui.main;


import android.app.Application;
import android.support.annotation.NonNull;

import com.qinggan.javamvvm.ui.hotel.HotelActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;
import me.goldze.mvvmhabit.bus.event.SingleLiveEvent;

public class MainViewModel extends BaseViewModel {
    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public final SingleLiveEvent<String> title = new SingleLiveEvent<>();

    @Override
    public void onCreate() {
        super.onCreate();
        title.setValue("预定酒店");

    }

    public void bookHotel(){
        startActivity(HotelActivity.class);
    }
}
