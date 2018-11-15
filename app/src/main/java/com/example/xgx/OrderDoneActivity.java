package com.example.xgx;

public class OrderDoneActivity extends BaseActivity {


    @Override
    protected void init() {
        tv_title.setText("完成订单");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_order_done;
    }
}
