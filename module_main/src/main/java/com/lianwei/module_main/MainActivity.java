package com.lianwei.module_main;

import android.os.Bundle;
import android.view.MenuItem;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.lee.base.FragmentHelper;
import com.lee.base.mvp.BasePresenter;
import com.lee.base.ui.BaseActivity;
import com.lianwei.module_router.HomeModulePath;
import com.lianwei.module_router.LiveModulePath;
import com.lianwei.module_router.MainModulePath;

import androidx.annotation.NonNull;
import butterknife.BindView;

@Route(path = MainModulePath.MAIN_ACTIVITY)
public class MainActivity extends BaseActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @BindView(R2.id.bottom_app_bar)
    BottomNavigationView bottomBar;

    private FragmentHelper fragmentHelper;

    @Override
    protected int getLayoutId() {
        return R.layout.main_activity_main;
    }

    @Override
    protected BasePresenter setPresenter() {
        return null;
    }

    @Override
    protected void initData(Bundle savedInstanceState) {
        bottomBar.setItemIconTintList(null);
        bottomBar.setOnNavigationItemSelectedListener(this);

        fragmentHelper = new FragmentHelper(this,R.id.fl_container);
        fragmentHelper.addFragment(HomeModulePath.HOME_FRAGMENT);
        fragmentHelper.addFragment(LiveModulePath.LIVE_FRAGMENT);
        fragmentHelper.switchFragment(0);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_home_1) {
            fragmentHelper.switchFragment(0);
            return true;
        } else if (itemId == R.id.menu_home_2) {
            fragmentHelper.switchFragment(1);
            return true;
        }
        return false;
    }
}
