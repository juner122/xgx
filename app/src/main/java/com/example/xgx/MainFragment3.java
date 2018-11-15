package com.example.xgx;


import android.view.View;


import butterknife.OnClick;

/**
 * 主页页面：扫描接单
 */
public class MainFragment3 extends BaseFragment {


    @Override
    public int setLayoutResourceID() {
        return R.layout.fragment3_main;
    }

    @Override
    protected void setUpView() {

    }


    @OnClick(R.id.but_next)
    public void onClick(View view) {

        toActivity(MemberInfoInputActivity.class);


    }


}
