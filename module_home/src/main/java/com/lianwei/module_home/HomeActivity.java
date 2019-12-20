package com.lianwei.module_home;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lee.base.mvp.BasePresenter;
import com.lee.base.ui.BaseActivity;
import com.lianwei.module_router.HomeModulePath;
import com.lianwei.module_router.LiveModulePath;

@Route(path = HomeModulePath.HOME_ACTIVITY)
public class HomeActivity extends BaseActivity {


    @Override
    protected int getLayoutId() {
        return R.layout.home_activity_home;
    }

    @Override
    protected BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    public void onClick(View view) {
        ARouter.getInstance().build(LiveModulePath.LIVE_ACTIVITY).navigation(this);
        finish();
    }
}
