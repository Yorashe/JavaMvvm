package com.qinggan.interceptor;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;

import me.goldze.mvvmhabit.utils.KLog;

/**
 * Created by Yorashe on 19-10-9.
 */
@Interceptor(priority = 3)
public class QGInterceptor implements IInterceptor {
    private Context mContext;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        KLog.e("postcard.getPath=", postcard.getPath());
        if (true){
            //打断
//            windmanager.update(HotelView);
            callback.onInterrupt(null);
        }else{
            //交换控制权
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {
        mContext = context;
        KLog.e("testService", QGInterceptor.class.getName() + " has init.");

    }
}
