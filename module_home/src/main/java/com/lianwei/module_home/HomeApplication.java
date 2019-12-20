package com.lianwei.module_home;

import com.lee.base.BaseApplication;

/**
 * Author ：lee
 * Date ：2019/12/20 19:07
 * Description ：
 */
public class HomeApplication extends BaseApplication {

    @Override
    protected void init() {
        new HomeModuleLife().init(this,isDebug());
    }

    @Override
    protected boolean isDebug() {
        return false;
    }

}
