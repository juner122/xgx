package com.example.xgx.adapter;

import android.support.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.xgx.R;
import com.example.xgx.bean.CourseListItemEntity;
import com.example.xgx.bean.ProductListItemEntity;

import java.util.List;

public class CourseListAdapter extends BaseQuickAdapter<CourseListItemEntity, BaseViewHolder> {


    public CourseListAdapter(@Nullable List<CourseListItemEntity> data) {
        super(R.layout.activity_meal_list_item, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, CourseListItemEntity item) {
        helper.setText(R.id.tv_title, item.getTitle());
        helper.setText(R.id.tv_type, item.getSynopsis());
        helper.setText(R.id.tv_price1, item.getPrice());
        helper.setText(R.id.tv_action, "查看");


    }
}
