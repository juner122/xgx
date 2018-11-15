package com.example.xgx;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityPackageListActivity extends BaseActivity {

    @Override
    protected void init() {
        tv_title.setText("活动列表");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_activity_package_list;
    }


}
