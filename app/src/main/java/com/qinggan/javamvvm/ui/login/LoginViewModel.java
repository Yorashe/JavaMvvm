package com.qinggan.javamvvm.ui.login;

import android.app.Application;
import android.arch.lifecycle.MutableLiveData;
import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.qinggan.javamvvm.ui.main.MainActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;


/**
 * Created by Yorashe on 19-9-30.
 */
public class LoginViewModel extends BaseViewModel {
    public final MutableLiveData<String> userName = new MutableLiveData<>();

    public final MutableLiveData<String> pwd = new MutableLiveData<>();

    public final MutableLiveData<Boolean> _startMain = new MutableLiveData<>();

    public LoginViewModel(@NonNull Application application) {
        super(application);
    }


    public void toLogin(){
        if (TextUtils.isEmpty(userName.getValue())){
            showToast("请输入帐号");
            return;
        }else if(TextUtils.isEmpty(pwd.getValue())){
            showToast("请输入密码");
            return;
        }
        _startMain.setValue(true);
        startActivity(MainActivity.class);
    }






}
