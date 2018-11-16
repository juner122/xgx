package com.example.xgx;

import android.app.Application;

import com.tamic.novate.Novate;

public class MyApplication extends Application {
    private static MyApplication app;



    public static MyApplication getInstance() {
        return app;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        app = this;


    }



}
