package com.example.xgx;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //设置布局
        setContentView(setLayoutResourceID());
        ButterKnife.bind(this);

        //初始化控件
        setUpView();

    }
    /**
     * 一些View的相关操作
     */
    protected abstract void setUpView();

    /**
     * 此方法用于返回Fragment设置ContentView的布局文件资源ID
     *
     * @return 布局文件资源ID
     */
    public abstract int setLayoutResourceID();

}
