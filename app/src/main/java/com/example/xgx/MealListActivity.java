package com.example.xgx;

import android.app.Activity;
import android.os.Bundle;

public class MealListActivity extends BaseActivity {


    @Override
    protected void init() {
        tv_title.setText("选择活动套餐");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_meal_list;
    }
}
