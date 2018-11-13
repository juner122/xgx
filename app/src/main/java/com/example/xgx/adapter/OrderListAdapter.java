package com.example.xgx.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xgx.R;
import com.example.xgx.bean.OrderListItemEntity;

import java.util.List;

public class OrderListAdapter extends BaseQuickAdapter<OrderListItemEntity, BaseViewHolder> {



    public OrderListAdapter(int layoutResId, @Nullable List<OrderListItemEntity> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, OrderListItemEntity item) {
        helper.setText(R.id.tv_plate_number, item.getPlateNumber());
        helper.setText(R.id.tv_order_number, item.getOrderNumber());
        helper.setText(R.id.tv_date, item.getDate());
        helper.setText(R.id.tv_order_state, item.getOrderState());
        helper.setText(R.id.tv_money, item.getMoney());



    }
}
