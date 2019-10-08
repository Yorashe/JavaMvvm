package com.qinggan.javamvvm.ui.main;


import android.app.Application;
import android.support.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.qinggan.router.RouterActivityPath;

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
        ARouter.getInstance().build(RouterActivityPath.Hotel.PAGER_HOTEL).navigation();
    }
}
