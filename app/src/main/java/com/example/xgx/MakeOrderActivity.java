package com.example.xgx;

import android.view.View;

import butterknife.OnClick;

;

public class MakeOrderActivity extends BaseActivity {

    @Override
    protected void init() {
        tv_title.setText("下单信息");
    }

    @Override
    protected void setUpView() {

    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_make_order;
    }


    @OnClick({R.id.but_product_list, R.id.but_meal_list, R.id.but_to_technician_list, R.id.but_set_date, R.id.but_enter_order})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.but_product_list:
                toActivity(ProductListActivity.class);
                break;
            case R.id.but_meal_list:
                toActivity(MealListActivity.class);
                break;
            case R.id.but_to_technician_list:
                toActivity(TechnicianListActivity.class);
                break;

            case R.id.but_set_date:
                break;

            case R.id.but_enter_order:
                toActivity(MakeOrderSuccessActivity.class);
                break;


        }

    }
}
