package com.lianwei.module_main;

import com.lee.base.BaseApplication;

/**
 * Author ：lee
 * Date ：2019/12/20 14:47
 * Description ：
 */
public class MainApplication extends BaseApplication {

    private MainModuleLife life;

    @Override
    protected void init() {
        life = new MainModuleLife();
        life.init(this,isDebug());
    }

    @Override
    protected boolean isDebug() {
        return true;
    }
}
