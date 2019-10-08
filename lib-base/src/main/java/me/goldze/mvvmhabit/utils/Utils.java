package me.goldze.mvvmhabit.utils;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.support.annotation.NonNull;

import com.safframework.tony.common.reflect.Reflect;

/**
 * Created by goldze on 2017/5/14.
 * 常用工具类
 */
public final class Utils {

    @SuppressLint("StaticFieldLeak")
    private static Context context;

    private Utils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(@NonNull final Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取全局的context，也就是Application Context
     * @return 返回全局的Context，只适用于android 4.0以后
     */
    @TargetApi(14)
    public static Context getContext() {
        return Reflect.on("android.app.ActivityThread").call("currentApplication").get();
    }
}