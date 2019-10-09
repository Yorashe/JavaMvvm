package com.qinggan.main.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.alibaba.android.arouter.launcher.ARouter;
import com.qinggan.router.RouterActivityPath;

/**
 * 冷启动
 */

public class SplashActivity extends Activity {

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                inMain();
            }
        }, 1* 1000);
    }

    /**
     * 进入主页面
     */
    private void inMain() {

        ARouter.getInstance().build(RouterActivityPath.Login.PAGER_LOGIN).navigation();
        finish();
    }
}
