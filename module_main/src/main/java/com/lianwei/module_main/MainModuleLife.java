package com.lianwei.module_main;

import android.app.Application;

import com.blankj.utilcode.util.LogUtils;
import com.lee.base.IComponentModuleLife;

/**
 * Author ：lee
 * Date ：2019/12/20 17:19
 * Description ：
 */
public class MainModuleLife implements IComponentModuleLife {


    @Override
    public void init(Application context, boolean isDebug) {
        //init this module need sdk
        LogUtils.d("init MainModuleLife success");
    }

}
