package com.example.viewpagerdemo;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    ViewPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        Demofragment demofragment=new Demofragment();
        Bundle bundle=new Bundle();
        position=position+1;
        bundle.putInt("id", position);
        demofragment.setArguments(bundle);
        return demofragment;
    }

    @Override
    public int getCount() {
        return 10;
    }
}
