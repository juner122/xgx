package com.example.xgx.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xgx.R;
import com.example.xgx.bean.OrderListItemEntity;
import com.example.xgx.bean.ProductListItemEntity;

import java.util.List;

public class ProductListAdapter extends BaseQuickAdapter<ProductListItemEntity, BaseViewHolder> {


    public ProductListAdapter( @Nullable List<ProductListItemEntity> data) {
        super(R.layout.activity_product_list_fr_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, ProductListItemEntity item) {
        helper.setText(R.id.tv_product_name, item.getProductName());
        helper.setText(R.id.tv_product_ts, item.getProductTS());
        helper.setText(R.id.tv_price, item.getPrice());


    }
}
