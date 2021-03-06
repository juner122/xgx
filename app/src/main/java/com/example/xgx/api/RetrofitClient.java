package com.example.xgx.api;

import android.content.Context;
import android.util.Log;

import com.example.xgx.Configure;
import com.example.xgx.bean.BaseBean;
import com.example.xgx.bean.BillEntity;
import com.example.xgx.bean.MyBalanceEntity;
import com.example.xgx.bean.UserInfo;
import com.tamic.novate.BaseApiService;
import com.tamic.novate.BaseSubscriber;
import com.tamic.novate.Novate;

import java.lang.annotation.Documented;
import java.util.HashMap;
import java.util.Map;

import okhttp3.ResponseBody;
import rx.Observable;
import rx.functions.Func1;

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

    /**
     * 获取用户信息
     */
    public void getUserInfo(MySubscriber<UserInfo> bodyBaseSubscriber, String token) {
        Map<String, Object> map = new HashMap<>();
        map.put("X-Nideshop-Token", token);


        novate.call(apiService.getUserInfo(map).map(new HttpResultFunc<UserInfo>()), bodyBaseSubscriber);
    }


    public void getPhoneCode(MySubscriber<BaseBean<UserInfo>> bodyBaseSubscriber, String phoneNumber) {
        Map<String, Object> map = new HashMap<>();
        map.put("phone", phoneNumber);
        novate.call(apiService.getUserInfo(map), bodyBaseSubscriber);
    }

    /**
     * 获取用户余额信息
     */
    public void getUserBalanceInfo(MySubscriber<MyBalanceEntity> bodyBaseSubscriber) {
        Map<String, Object> map = new HashMap<>();
        map.put("X-Nideshop-Token", "1");

        novate.call(apiService.getUserBalanceInfo(map).map(new HttpResultFunc<MyBalanceEntity>()), bodyBaseSubscriber);

    }

    /**
     * 获取用户账单列表
     *
     * @param limit 页数
     */
    public void getUserBillList(MySubscriber<BillEntity> bodyBaseSubscriber, int page, int limit, String sidx, String order) {
        Map<String, Object> map = new HashMap<>();
        map.put("X-Nideshop-Token", "1");
        map.put("page", page);
        map.put("limit", limit);
        map.put("sidx", sidx);
        map.put("order", order);

        novate.call(apiService.getUserBillList(map).map(new HttpResultFunc<BillEntity>()), bodyBaseSubscriber);
    }

    /**
     * 用来统一处理Http的resultCode,并将HttpResult的Data部分剥离出来返回给subscriber
     *
     * @param <T> Subscriber真正需要的数据类型，也就是Data部分的数据类型
     */
    private class HttpResultFunc<T> implements Func1<BaseBean<T>, T> {

        @Override
        public T call(BaseBean<T> httpResult) {
            if (httpResult.getErrno() != 0) {
                throw new ApiException(httpResult.getErrmsg());
            }
            return httpResult.getData();
        }
    }


}
