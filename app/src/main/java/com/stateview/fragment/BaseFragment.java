package com.stateview.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tqzhang.stateview.core.LoadManager;
import com.tqzhang.stateview.core.LoadState;
import com.tqzhang.stateview.stateview.BaseStateControl;

/**
 * @author：zhangtianqiu on 18/7/23 18:01
 */
public abstract class BaseFragment extends Fragment {
    protected LoadManager loadManager;


    private View parentView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        parentView = inflater.inflate(getLayoutResId(), null, false);
        loadManager = new LoadManager.Builder()
                .setViewParams(parentView)
                .setListener(new BaseStateControl.OnRefreshListener() {
                    @Override
                    public void onRefresh(View v) {
                        onStateRefresh();
                    }
                })
                .build();
        return loadManager.getLoadLayout();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(savedInstanceState);
    }

    protected abstract void initView(Bundle savedInstanceState);

    protected abstract int getLayoutResId();

    protected void onStateRefresh() {

    }
}
