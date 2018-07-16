package com.example.android.chelyabinsktourguide;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.android.chelyabisktourguide.R;

public class CustomViewPager extends FragmentPagerAdapter {

    private Context context;

    public CustomViewPager(FragmentManager fm, Context mContext) {
        super(fm);
        context = mContext;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FoodFragment();
            case 1:
                return new MoviesFragment();
            case 2:
                return new ArtFragment();
            case 3:
                return new HotelsFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return context.getString(R.string.category_food);
            case 1:
                return context.getString(R.string.category_movies);
            case 2:
                return context.getString(R.string.category_art);
            case 3:
                return context.getString(R.string.category_shops);
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
