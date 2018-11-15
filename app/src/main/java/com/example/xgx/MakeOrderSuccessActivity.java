package com.example.xgx;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;

public class MakeOrderSuccessActivity extends BaseActivity {


    @Override
    protected void init() {
        tv_title.setText("下单成功");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_make_order_success;
    }

    @OnClick({R.id.tv_now_pay, R.id.tv_start_service})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tv_now_pay:
                toActivity(OrderPayActivity.class);
                break;
            case R.id.tv_start_service:
                finish();
                break;



        }

    }


}
