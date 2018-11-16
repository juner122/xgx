package com.example.xgx.api;

import android.content.Context;
import android.util.Log;

import com.example.xgx.Configure;
import com.example.xgx.bean.BaseBean;
import com.example.xgx.bean.UserInfo;
import com.tamic.novate.BaseApiService;
import com.tamic.novate.BaseSubscriber;
import com.tamic.novate.Novate;

import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;

public class RetrofitClient {

    private ApiService apiService;


    private Novate novate;

    public static String baseUrl = Configure.BaseUrl;

    private static Context mContext;


    private static class SingletonHolder {
        private static RetrofitClient INSTANCE = new RetrofitClient(mContext);
    }

    public static RetrofitClient getInstance(Context context) {
        if (context != null) {
            Log.v("RetrofitClient", "getInstance" + "");
            mContext = context;
        }
        return SingletonHolder.INSTANCE;
    }


    private RetrofitClient(Context context) {

        novate = new Novate.Builder(context)
                .addLog(true)
                .baseUrl(baseUrl).build();
        apiService = novate.create(ApiService.class);
    }

    public void getUserInfo(MySubscriber<BaseBean<UserInfo>> bodyBaseSubscriber ,String token) {
        Map<String, Object> map = new HashMap<>();
        map.put("X-Nideshop-Token", token);
        novate.call(apiService.getUserInfo(map), bodyBaseSubscriber);
    }

    public void getPhoneCode(MySubscriber<BaseBean<UserInfo>> bodyBaseSubscriber ,String phoneNumber) {
        Map<String, Object> map = new HashMap<>();
        map.put("phone", phoneNumber);
        novate.call(apiService.getUserInfo(map), bodyBaseSubscriber);
    }


}
