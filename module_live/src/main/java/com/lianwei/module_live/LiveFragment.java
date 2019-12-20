package com.lianwei.module_live;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.lee.base.mvp.BasePresenter;
import com.lee.base.ui.BaseFragment;
import com.lianwei.module_router.LiveModulePath;

import butterknife.OnClick;

/**
 * Author ：lee
 * Date ：2019/12/20 18:32
 * Description ：
 */
@Route(path = LiveModulePath.LIVE_FRAGMENT)
public class LiveFragment extends BaseFragment {


    @Override
    protected int getLayoutId() {
        return R.layout.live_fragment_main;
    }

    @Override
    protected BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @OnClick({R2.id.button})
    public void onClick(View view) {
        ARouter.getInstance().build(LiveModulePath.LIVE_ACTIVITY).navigation(getActivity());
    }
}
