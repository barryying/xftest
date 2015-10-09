package com.linky.xftest;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by linky on 15-10-9.
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // 将“12345678”替换成您申请的APPID，申请地址：http://open.voicecloud.cn
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=5617d5be");
    }
}
