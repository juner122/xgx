package com.example.xgx.bean;

public class BaseBean<T> {


    String errno;
    String errmsg;

    T data;

    public String getErrno() {
        return errno;
    }

    public void setErrno(String errno) {
        this.errno = errno;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BaseBea{" +
                "errno='" + errno + '\'' +
                ", errmsg='" + errmsg + '\'' +
                ", data=" + data +
                '}';
    }
}
