package com.stateview.adapter;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.stateview.fragment.Fragment1;
import com.stateview.fragment.Fragment2;
import com.stateview.fragment.Fragment3;
import com.stateview.fragment.Fragment4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author：zhangtianqiu on 18/7/23 17:53
 */
public class FragmentAdapter extends FragmentStatePagerAdapter {


    private List<Fragment> mFragments;
    private List<String> titleName;
    private FragmentManager mFragmentManager;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        mFragments = new ArrayList<>();
        titleName = new ArrayList<>();
        mFragmentManager = fm;
        mFragments.clear();
        initFragment();
    }


    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return titleName != null ? titleName.size() : 0;
    }

    @Override
    public void restoreState(Parcelable state, ClassLoader loader) {
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return titleName != null ? titleName.get(position) : null;
    }

    private void initFragment() {
        mFragments.add(new Fragment1());
        mFragments.add(new Fragment2());
        mFragments.add(new Fragment3());
        mFragments.add(new Fragment4());
        titleName.add("无网络");
        titleName.add("无数据");
        titleName.add("超时链接");
        titleName.add("其他错误");
    }

}
