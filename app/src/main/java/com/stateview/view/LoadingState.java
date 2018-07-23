package com.stateview.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.stateview.R;
import com.tqzhang.stateview.stateview.BaseStateControl;

/**
 * @author：zhangtianqiu on 18/7/23 15:49
 */
public class LoadingState extends BaseStateControl {

    @Override
    protected int onCreateView() {
        return R.layout.loading_view;
    }


    @Override
    public boolean isVisible() {
        return super.isVisible();
    }

}
