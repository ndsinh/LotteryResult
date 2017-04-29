package com.labs.lotteryresult.Gson;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CM {

    @SerializedName("17-04")
    @Expose
    private com.labs.lotteryresult.Gson._1704 _1704;
    @SerializedName("24-04")
    @Expose
    private com.labs.lotteryresult.Gson._2404 _2404;

    public com.labs.lotteryresult.Gson._1704 get1704() {
        return _1704;
    }

    public void set1704(com.labs.lotteryresult.Gson._1704 _1704) {
        this._1704 = _1704;
    }

    public com.labs.lotteryresult.Gson._2404 get2404() {
        return _2404;
    }

    public void set2404(com.labs.lotteryresult.Gson._2404 _2404) {
        this._2404 = _2404;
    }

}
