package com.labs.lotteryresult;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.labs.lotteryresult.Fragment.LotteryFragment;

import java.util.List;


public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<LotteryFragment> data;
    private String[] nameTab;
    public PagerAdapter(FragmentManager fm, List<LotteryFragment> data , String[] nameTab ) {
        super(fm);
        this.data = data;
        this.nameTab =nameTab;
    }

    @Override
    public Fragment getItem(int position) {
        return data.get(position);
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return  nameTab[position];
    }
}