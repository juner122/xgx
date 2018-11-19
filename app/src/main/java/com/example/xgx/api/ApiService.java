package com.example.xgx.api;


import android.support.annotation.Nullable;

import com.example.xgx.bean.BaseBean;
import com.example.xgx.bean.BillEntity;
import com.example.xgx.bean.MyBalanceEntity;
import com.example.xgx.bean.UserInfo;

import java.lang.annotation.Documented;
import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import rx.Observable;

public interface ApiService {


    @GET("login")
    Observable<ResponseBody> login();




    @POST("user/getInfo")
    @FormUrlEncoded
    Observable<BaseBean<UserInfo>> getUserInfo(@FieldMap Map<String, Object> maps);


    @POST("userbalance/getInfo")
    @FormUrlEncoded
    Observable<BaseBean<MyBalanceEntity>> getUserBalanceInfo(@FieldMap Map<String, Object> maps);



    //账单列表
    @POST("userbalancedetail/list")
    @FormUrlEncoded
    Observable<BaseBean<BillEntity>> getUserBillList(@FieldMap Map<String, Object> maps);



    @POST("getPhoneCode")
    @FormUrlEncoded
    Observable<BaseBean<Nullable>> getPhoneCode(@FieldMap Map<String, Object> maps);
}
