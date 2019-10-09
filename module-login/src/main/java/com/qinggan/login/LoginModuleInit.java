package com.qinggan.login;

import android.app.Application;

import com.qinggan.base.IModuleInit;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by Yorashe on 19-10-9.
 */
public class LoginModuleInit implements IModuleInit {
    @Override
    public boolean onInitAhead(Application application) {
        KLog.e("登录块初始化 -- onInitAhead");
        return false;
    }

    @Override
    public boolean onInitLow(Application application) {
        KLog.e("登录块初始化 -- onInitLow");

        return false;
    }
}
