package com.qinggan.javamvvm.ui.login;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.qinggan.javamvvm.R;
import com.qinggan.javamvvm.databinding.LoginBinding;

import me.goldze.mvvmhabit.base.BaseActivity;


/**
 * Created by Yorashe on 19-9-30.
 */
public class LoginActivity extends BaseActivity<LoginBinding,LoginViewModel> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.login;
    }

    @Override
    public int initVariableId() {
        return com.qinggan.javamvvm.BR.loginVm;
    }

}
