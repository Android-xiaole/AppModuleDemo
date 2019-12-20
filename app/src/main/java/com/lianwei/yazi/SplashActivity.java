package com.lianwei.yazi;

import android.os.Bundle;
import android.os.CountDownTimer;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lee.base.mvp.BasePresenter;
import com.lee.base.ui.BaseActivity;
import com.lianwei.module_router.MainModulePath;

public class SplashActivity extends BaseActivity {

    private CountDownTimer timer;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        timer = new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                showShortToast(millisUntilFinished/1000+"");
            }

            @Override
            public void onFinish() {
                ARouter.getInstance().build(MainModulePath.MAIN_ACTIVITY).navigation();
                finish();
            }
        };
        timer.start();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timer!=null){
            timer.cancel();
        }
    }

}
