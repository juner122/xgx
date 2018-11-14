package com.example.xgx;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;

public class ProductListActivity extends BaseActivity {


    @BindView(R.id.rg_type)
    RadioGroup radioGroup;

    @BindView(R.id.tv_ok)
    TextView tv_ok;


    ProductListFragment fragment;

    private final String[] mTitles = {
            "常用商品", "轮胎", "汽车滤芯"
            , "养护", "车载电器", "内饰精品", "制动系统", "空调系统", "冷却系统", "自定义商品"
    };









    @Override
    protected void init() {
        replaceFragment();
    }

    @Override
    protected void setUpView() {


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId) {
                    case R.id.rb1:
                        fragment.switchData(1);
                        break;
                    case R.id.rb2:
                        fragment.switchData(2);
                        break;
                }
            }


        });


    }

    private void replaceFragment() {


        fragment = new ProductListFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.right_layout, fragment);
        transaction.commit();
    }

    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_product_list;
    }


}
