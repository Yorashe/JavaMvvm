package com.qinggan.javamvvm.ui.hotel;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.support.v4.os.HandlerCompat;
import android.view.View;

import io.reactivex.annotations.NonNull;
import me.goldze.mvvmhabit.base.BaseViewModel;

/**
 * Created by Yorashe on 19-9-30.
 */
public class HotelDetailsViewModel extends BaseViewModel {
    public MutableLiveData<Hotel> hotel = new MutableLiveData<>();

    public static String url ="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1569844480407&di=b312da087e380dddc46a8bb96c68ad20&imgtype=0&src=http%3A%2F%2Fuserimg.qunar.com%2Fimgs%2F201411%2F05%2FC.nOSnk00eLkAurBkb0720.jpg";
    public HotelDetailsViewModel(@NonNull Application application) {
        super(application);
    }


    @Override
    public void onCreate() {
        super.onCreate();
        Hotel mhotel =new Hotel();
        mhotel.setName("红杏酒家");
        mhotel.setCheckInDay("10-01");
        mhotel.setCheckOutDay("10-02");
        mhotel.setInfo("早餐/wifi");
        mhotel.setRoomInfo("大床房");
        mhotel.setScore("4.4");
        mhotel.setRoomPrice("505");
        mhotel.setImgUri(url);
        hotel.setValue(mhotel);
    }


    public void cancel(View v){
        finish();
        showToast("取消预定");
    }

    public void book(View v){
        showDialog("正在预定");
    }


}
