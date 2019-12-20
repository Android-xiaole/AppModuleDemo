package com.lianwei.module_home;

import android.app.Application;

import com.blankj.utilcode.util.LogUtils;
import com.lee.base.IComponentModuleLife;

/**
 * Author ：lee
 * Date ：2019/12/20 19:07
 * Description ：
 */
public class HomeModuleLife implements IComponentModuleLife {

    @Override
    public void init(Application context, boolean isDebug) {
        LogUtils.d("init HomeModuleLife ok");
    }
}
