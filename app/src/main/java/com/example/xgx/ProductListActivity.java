package com.example.xgx;


import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioGroup;
import android.widget.TextView;

import butterknife.BindView;

public class ProductListActivity extends BaseActivity {


    @BindView(R.id.rg_type)
    RadioGroup radioGroup;

    ProductListFragment fragment;

    @Override
    protected void init() {
        tv_title.setText("商品列表");
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
