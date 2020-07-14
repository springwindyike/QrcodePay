package com.jiewen.qrcodepay;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Log;

import com.jiewen.qrcodepay.db.DataBaseHelper;

public class MyApplication extends Application {
    String TAG  = "MainApplication";

    public static MyApplication mApplication;

    public static String sp = "UserSetting";

    public static String deleteDataBeanTag = "deleteDataBeanTag";
    public static String deleteLogTag = "deleteLogTag";

    public static String merIdTag = "131703040036";
    public static String storCodeTag = "13170003191";
    public static String publicKeyTag = "publicKeyTag";
    public static String privateKeyTag = "privateKeyTag";
    public static String appIdTag = "appIdTag";

    public static String snTag = "snTag";

    public static MyApplication getInstance(){
        if (null == mApplication){
            mApplication = new MyApplication();
        }
        return mApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
        //初始化本地数据库
        DataBaseHelper.initOrmLite(this);
//        initImageLoader();
    }

    /**
     * 获取用户设置
     *
     * @param key 用户某设置的名称
     * @return
     */
    public String getUserSetting(String key)
    {
        SharedPreferences settings = mApplication.getSharedPreferences(sp, 0);
        return settings.getString(key, "");
    }


    /**
     *
     * @param key 用户某设置的名称
     * @param value 值
     */
    public void modifyUserSetting(String key, String value)
    {
        SharedPreferences settings = mApplication.getSharedPreferences(sp, 0);

        settings.edit().putString(key, value).commit();
    }

    @Override
    public void onTerminate() {
        // 程序终止的时候执行
        Log.d(TAG, "onTerminate");
        super.onTerminate();
    }
    @Override
    public void onLowMemory() {
        // 低内存的时候执行
        Log.d(TAG, "onLowMemory");
        super.onLowMemory();
    }
    @Override
    public void onTrimMemory(int level) {
        // 程序在内存清理的时候执行
        Log.d(TAG, "onTrimMemory");
        super.onTrimMemory(level);
    }
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.d(TAG, "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }

}
