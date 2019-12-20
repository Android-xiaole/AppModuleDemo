package com.lianwei.module_live;

import android.app.Application;

import com.blankj.utilcode.util.LogUtils;
import com.lee.base.IComponentModuleLife;

/**
 * Author ：lee
 * Date ：2019/12/20 17:10
 * Description ：
 */
public class LiveModuleLife implements IComponentModuleLife {

    @Override
    public void init(Application context, boolean isDebug) {
        LogUtils.d("init LiveModuleLife success");
    }

}
