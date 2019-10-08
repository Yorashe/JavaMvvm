package com.qinggan.javamvvm.ui.main;

import android.os.Bundle;


import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.qinggan.javamvvm.BR;
import com.qinggan.javamvvm.R;
import com.qinggan.javamvvm.databinding.MainFragmentBinding;
import me.goldze.mvvmhabit.base.BaseFragment;

public class MainFragment extends BaseFragment<MainFragmentBinding,MainViewModel> {

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public int initContentView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return R.layout.main_fragment;
    }

    @Override
    public int initVariableId() {
        return com.qinggan.javamvvm.BR.mainVm;
    }


}
