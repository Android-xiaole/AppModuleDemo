package com.lianwei.module_home;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lee.base.mvp.BasePresenter;
import com.lee.base.ui.BaseFragment;
import com.lianwei.module_router.HomeModulePath;

import butterknife.OnClick;

/**
 * Author ：lee
 * Date ：2019/12/20 18:59
 * Description ：
 */
@Route(path = HomeModulePath.HOME_FRAGMENT)
public class HomeFragment extends BaseFragment {

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment_home;
    }

    @Override
    protected BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @OnClick(R2.id.button)
    public void onClick(View view){
        ARouter.getInstance().build(HomeModulePath.HOME_ACTIVITY).navigation(getActivity());
    }

}
