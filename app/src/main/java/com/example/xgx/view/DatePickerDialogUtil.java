package com.example.xgx.view;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerDialogUtil {

    int mYear;
    int mMonth;
    int mDay;

    DatePickerDialog pickerDialog;
    DatePickerDialog.OnDateSetListener dateSetListener;
    Context mContext;

    public DatePickerDialogUtil(Context context, DatePickerDialog.OnDateSetListener listener) {
        mContext = context;
        dateSetListener = listener;

        Calendar ca = Calendar.getInstance();
        mYear = ca.get(Calendar.YEAR);
        mMonth = ca.get(Calendar.MONTH);
        mDay = ca.get(Calendar.DAY_OF_MONTH);


    }

    public DatePickerDialogUtil getDialogUtil() {
        return this;
    }




    public void show(int y,int m,int d) {

        pickerDialog = new DatePickerDialog(mContext, DatePickerDialog.THEME_DEVICE_DEFAULT_DARK,
                dateSetListener,
                y, m, d);
        pickerDialog.show();
    }


}
