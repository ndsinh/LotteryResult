package com.labs.lotteryresult;

import com.labs.lotteryresult.Ngay;

import java.util.ArrayList;

public class Tinh {
    private String tenTinh;
    private ArrayList<Ngay> ngay;

    public Tinh(String tenTinh, ArrayList<Ngay> ngay) {
        this.tenTinh = tenTinh;
        this.ngay = ngay;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }

    public ArrayList<Ngay> getNgay() {
        return ngay;
    }

    public void setNgay(ArrayList<Ngay> ngay) {
        this.ngay = ngay;
    }
}
