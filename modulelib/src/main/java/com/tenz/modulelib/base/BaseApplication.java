package com.tenz.modulelib.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Author: TenzLiu
 * Time: 2018/7/5 14:33
 * Desc:
 */

public class BaseApplication extends Application {

    private boolean isDebug = true;

    @Override
    public void onCreate() {
        super.onCreate();
        if(isDebug){
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

}
