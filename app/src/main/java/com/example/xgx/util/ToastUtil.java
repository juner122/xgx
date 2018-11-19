package com.example.xgx.util;

import android.widget.Toast;

import com.example.xgx.MyApplication;

public class ToastUtil {


    public static void ToastCenter(String message) {

        Toast.makeText(MyApplication.getInstance(), message, Toast.LENGTH_SHORT).show();


    }

}
