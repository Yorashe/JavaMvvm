package com.qinggan.javamvvm.ui.hotel;

import android.os.Bundle;

import com.qinggan.javamvvm.BR;
import com.qinggan.javamvvm.R;
import com.qinggan.javamvvm.databinding.CardViewHotelLayoutBinding;

import me.goldze.mvvmhabit.base.BaseActivity;

/**
 * Created by Yorashe on 19-9-30.
 */
public class HotelActivity extends BaseActivity<CardViewHotelLayoutBinding,HotelDetailsViewModel>{


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.card_view_hotel_layout;
    }

    @Override
    public int initVariableId() {
        return com.qinggan.javamvvm.BR.hotelVm;
    }
}
