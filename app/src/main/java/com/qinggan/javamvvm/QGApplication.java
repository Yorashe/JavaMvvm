package com.qinggan.javamvvm;

import android.app.Application;

import com.qinggan.config.ModuleLifecycleConfig;

/**
 * Created by Yorashe on 19-10-8.
 */
public class QGApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化组件(靠前)
        ModuleLifecycleConfig.getInstance().initModuleAhead(this);
        //....
        //初始化组件(靠后)
        ModuleLifecycleConfig.getInstance().initModuleLow(this);
    }
}
