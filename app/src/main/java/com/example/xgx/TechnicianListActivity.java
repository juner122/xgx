package com.example.xgx;


public class TechnicianListActivity extends BaseActivity {


    @Override
    protected void init() {
        tv_title.setText("选择技师");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_technician_list;
    }
}