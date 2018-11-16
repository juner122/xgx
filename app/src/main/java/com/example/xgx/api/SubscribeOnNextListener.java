package com.example.xgx.api;

public interface SubscribeOnNextListener<T> {

    void onNext(T t);

    void onError(Throwable e);
}
