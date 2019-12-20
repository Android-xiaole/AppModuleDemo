package com.lianwei.yazi;

import com.lee.base.BaseApplication;
import com.lianwei.module_home.HomeModuleLife;
import com.lianwei.module_live.LiveModuleLife;
import com.lianwei.module_main.MainModuleLife;

public class AppApplication extends BaseApplication {

    @Override
    protected void init() {
        //init something

        //添加各个模块下用于管理sdk初始化的类
        addModuleLifeClass(MainModuleLife.class);
        addModuleLifeClass(LiveModuleLife.class);
        addModuleLifeClass(HomeModuleLife.class);
    }

    @Override
    protected boolean isDebug() {
        return Constants.IS_DEBUG;
    }

}
