package com.qinggan.main.ui;

import android.os.Bundle;


import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.qinggan.main.R;
import com.qinggan.main.databinding.MainFragmentBinding;

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
        return com.qinggan.main.BR.mainVm;
    }


}
