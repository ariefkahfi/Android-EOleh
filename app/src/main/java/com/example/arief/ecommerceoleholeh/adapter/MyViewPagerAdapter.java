package com.example.arief.ecommerceoleholeh.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.arief.ecommerceoleholeh.fragments.ListProductFragment;
import com.example.arief.ecommerceoleholeh.fragments.SellProductFragment;

public class MyViewPagerAdapter extends FragmentPagerAdapter {

    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) return new ListProductFragment();
        else if(position == 1) return  new SellProductFragment();
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
