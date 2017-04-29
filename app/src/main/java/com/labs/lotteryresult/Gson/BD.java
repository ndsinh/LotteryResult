package com.labs.lotteryresult.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BD {

    @SerializedName("14-04")
    @Expose
    private com.labs.lotteryresult.Gson._1404 _1404;
    @SerializedName("21-04")
    @Expose
    private com.labs.lotteryresult.Gson._2104 _2104;

    public com.labs.lotteryresult.Gson._1404 get1404() {
        return _1404;
    }

    public void set1404(com.labs.lotteryresult.Gson._1404 _1404) {
        this._1404 = _1404;
    }

    public com.labs.lotteryresult.Gson._2104 get2104() {
        return _2104;
    }

    public void set2104(com.labs.lotteryresult.Gson._2104 _2104) {
        this._2104 = _2104;
    }

}
