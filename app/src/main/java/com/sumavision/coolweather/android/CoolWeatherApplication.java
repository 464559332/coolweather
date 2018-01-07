package com.sumavision.coolweather.android;

import android.app.Application;
import android.content.Context;

import org.litepal.LitePal;
import org.litepal.LitePalApplication;
import org.litepal.util.Const;

/**
 * Created by 46455 on 2018/1/7.
 */

public class CoolWeatherApplication extends Application {
    private static final String TAG = "CoolWeatherApplication";

    private static Context mContext;

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
    }

    @Override
    public void onCreate() {
        mContext = this;
        LitePal.initialize(mContext);
    }
}
