package com.example.xgx;


import android.view.View;

import butterknife.OnClick;

/**
 * 主页页面：扫描
 */
public class MainFragment5 extends BaseFragment {

    @Override
    public int setLayoutResourceID() {
        return R.layout.fragment5_main;
    }

    @Override
    protected void setUpView() {

    }


    @OnClick({R.id.tv_my_balance})
    public void onclick(View v) {


        switch (v.getId()) {

            case R.id.tv_my_balance:

                toActivity(MyBalanceActivity.class);

                break;


        }


    }
}
