package com.labs.lotteryresult.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BP {

    @SerializedName("15-04")
    @Expose
    private com.labs.lotteryresult.Gson._1504 _1504;
    @SerializedName("22-04")
    @Expose
    private com.labs.lotteryresult.Gson._2204 _2204;

    public com.labs.lotteryresult.Gson._1504 get1504() {
        return _1504;
    }

    public void set1504(com.labs.lotteryresult.Gson._1504 _1504) {
        this._1504 = _1504;
    }

    public com.labs.lotteryresult.Gson._2204 get2204() {
        return _2204;
    }

    public void set2204(com.labs.lotteryresult.Gson._2204 _2204) {
        this._2204 = _2204;
    }

}
