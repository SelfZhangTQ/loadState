package com.stateview;

import android.app.Application;

import com.stateview.view.ErrorState;
import com.stateview.view.LoadingState;
import com.tqzhang.stateview.core.LoadState;

/**
 * @author：zhangtianqiu on 18/7/23 15:38
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        new LoadState.Builder()
                .register(new ErrorState())
                .register(new LoadingState())
                .setDefaultCallback(LoadingState.class)
                .build();
    }
}
