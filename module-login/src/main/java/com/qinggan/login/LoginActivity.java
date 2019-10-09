package com.qinggan.login;

import android.os.Bundle;
import android.support.annotation.Nullable;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.qinggan.login.databinding.LoginLoginBinding;
import com.qinggan.router.RouterActivityPath;

import me.goldze.mvvmhabit.base.BaseActivity;


/**
 * Created by Yorashe on 19-9-30.
 */
@Route(path = RouterActivityPath.Login.PAGER_LOGIN)
public class LoginActivity extends BaseActivity<LoginLoginBinding,LoginViewModel> {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ARouter.getInstance().inject(this);
    }

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.login_login;
    }

    @Override
    public int initVariableId() {
        return com.qinggan.login.BR.loginVm;
    }

}
