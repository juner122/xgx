package com.example.xgx;


//员工管理
public class StaffManagementActivity extends BaseActivity {

    @Override
    protected void init() {
        tv_title.setText("员工列表");

    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_staff_management;
    }

}
