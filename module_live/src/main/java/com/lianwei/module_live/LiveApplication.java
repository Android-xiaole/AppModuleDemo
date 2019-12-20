package com.lianwei.module_live;

import com.lee.base.BaseApplication;

/**
 * Author ：lee
 * Date ：2019/12/18 17:26
 * Description ：模块化测试用的application，用于初始化该模块下必要的sdk
 */
public class LiveApplication extends BaseApplication {

    private LiveModuleLife life;

    @Override
    protected void init() {
        life = new LiveModuleLife();
        life.init(this,isDebug());
    }

    @Override
    protected boolean isDebug() {
        return true;
    }

}
