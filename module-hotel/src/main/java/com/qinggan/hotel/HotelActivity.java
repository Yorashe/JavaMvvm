package com.qinggan.hotel;

import android.os.Bundle;

import com.qinggan.hotel.databinding.HotelCardBtLayoutBinding;

import me.goldze.mvvmhabit.base.BaseActivity;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.qinggan.router.RouterActivityPath;

/**
 * Created by Yorashe on 19-9-30.
 */
@Route(path = RouterActivityPath.Hotel.PAGER_HOTEL)
public class HotelActivity extends BaseActivity<HotelCardBtLayoutBinding,HotelDetailsViewModel>{


    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.hotel_card_view_layout;
    }

    @Override
    public int initVariableId() {
        return com.qinggan.hotel.BR.hotelVm;
    }
}
