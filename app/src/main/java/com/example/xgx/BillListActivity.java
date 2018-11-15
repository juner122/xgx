package com.example.xgx;

import android.app.Activity;
import android.os.Bundle;

public class BillListActivity extends BaseActivity {

    @Override
    protected void init() {
        tv_title.setText("账单列表");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_bill_info;
    }
}
