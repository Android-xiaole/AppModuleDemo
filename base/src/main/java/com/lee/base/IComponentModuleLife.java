package com.lee.base;

import android.app.Application;

/**
 * Author ：lee
 * Date ：2019/12/20 17:01
 * Description ：每个module通用的sdk初始化接口
 */
public interface IComponentModuleLife {

    //用于初始化一些SDK
    void init(Application context, boolean isDebug);

}
