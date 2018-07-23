package com.stateview.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.stateview.R;
import com.tqzhang.stateview.stateview.BaseStateControl;

/**
 * @author：zhangtianqiu on 18/7/23 15:49
 */
public class ErrorState extends BaseStateControl {
    public final static String NO_NETWORK = "1";
    public final static String NO_DATA = "2";
    public final static String TIME_OUT = "3";

    @Override
    protected int onCreateView() {
        return R.layout.common_empty_view;
    }

    @Override
    protected void onViewCreate(Context context, View view) {
        TextView tv_desc = view.findViewById(R.id.tv_desc);
        if (view.getTag() != null) {
            if (view.getTag().equals("1")) {
                tv_desc.setText("网络不给力～_~");
            } else if (view.getTag().equals("2")) {
                tv_desc.setText("没有数据");
            } else if (view.getTag().equals("3")) {
                tv_desc.setText("链接超时");
            } else if (view.getTag().equals("4")) {
                tv_desc.setText("其他错误");
            }

        }
    }

    @Override
    public boolean isVisible() {
        return super.isVisible();
    }

    @Override
    protected boolean onReloadEvent(Context context, View view) {
        return false;
    }
}
