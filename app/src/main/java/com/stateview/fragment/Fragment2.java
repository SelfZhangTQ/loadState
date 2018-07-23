package com.stateview.fragment;

import android.os.Bundle;
import android.os.Handler;

import com.stateview.R;
import com.stateview.view.ErrorState;
import com.stateview.view.LoadingState;

/**
 * @author：zhangtianqiu on 18/7/23 18:01
 */
public class Fragment2 extends BaseFragment {
    @Override
    protected void initView(Bundle savedInstanceState) {
        loadManager.showStateView(ErrorState.class, "2");


    }

    @Override
    protected void onStateRefresh() {
        loadManager.showStateView(LoadingState.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadManager.showSuccess();
            }
        }, 3000);
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_2;
    }
}
