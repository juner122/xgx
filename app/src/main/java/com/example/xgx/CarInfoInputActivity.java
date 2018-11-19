package com.example.xgx;

import android.app.Activity;
import android.os.Bundle;

public class CarInfoInputActivity extends BaseActivity {

    @Override
    protected void init() {
        tv_title.setText("车况录入");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    protected void setUpData() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_car_status_entry;
    }
}
