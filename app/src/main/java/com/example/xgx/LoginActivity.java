package com.example.xgx;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.xgx.api.MySubscriber;
import com.example.xgx.api.RetrofitClient;
import com.example.xgx.api.SubscribeOnNextListener;
import com.example.xgx.bean.BaseBean;
import com.example.xgx.bean.UserInfo;

import java.util.concurrent.TimeUnit;

import butterknife.BindView;
import butterknife.OnClick;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class LoginActivity extends BaseActivity {


    @BindView(R.id.btu_get_phone_code)
    TextView tv_code;

    @Override
    protected void init() {
        super.hideHeadView();
    }

    @Override
    protected void setUpView() {

    }


    @Override
    public int setLayoutResourceID() {
        return R.layout.activity_login;
    }


    @OnClick({R.id.but_login, R.id.btu_get_phone_code})
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btu_get_phone_code:

                tv_code.setClickable(false);
                final Observable observable = Observable //计时器
                        .interval(0, 1, TimeUnit.SECONDS)
                        .take(61)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread());
                MySubscriber mySubscriber = new MySubscriber<>(this, new SubscribeOnNextListener<BaseBean<UserInfo>>() {
                    @Override
                    public void onNext(BaseBean<UserInfo> responseBody) {
                        Log.d("getUserInfo", "onNext->" + responseBody.toString());

                        observable.subscribe(new Action1<Long>() {
                            @Override
                            public void call(Long aLong) {
                                Log.d("interval", "onNext->" + aLong);

                                Long l = 59 - aLong;

                                tv_code.setText(l + "");
                            }
                        }, new Action1<Throwable>() {
                            @Override
                            public void call(Throwable throwable) {

                            }
                        }, new Action0() {
                            @Override
                            public void call() {
                                tv_code.setText("发送验证码");
                                tv_code.setClickable(true);
                            }
                        });
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e("getUserInfo", "onError->" + e.getMessage());
                    }

                });
                Api().getUserInfo(mySubscriber, "1");

                break;

            case R.id.but_login:
                toActivity(MainActivity.class);

                break;
        }


    }

}
