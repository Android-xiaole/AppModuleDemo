package com.lee.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.Utils;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.plugins.RxJavaPlugins;

/**
 * Author ：le
 * Date ：2019-10-21 16:43
 * Description ：BaseApplication用于初始化全局可用的东西
 */
public abstract class BaseApplication extends Application {

    private static List<Class<? extends IComponentModuleLife>> MODULE_LIFES = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        //初始化工具类
        Utils.init(this);
        //alibaba路由框架初始化
        ARouter.init(this);
        if(isDebug()){
            //alibaba路由框架打开log
            ARouter.openLog();
            ARouter.openDebug();
        }else{
            //rxjava全局捕获异常处理，建议只在线上模式打开，避免程序异常奔溃；debug模式下关闭，方便查看异常
            RxJavaPlugins.setErrorHandler(throwable -> LogUtils.e(throwable.getMessage()));
        }

        init();
        //遍历容器里添加的module class通过反射获取对象在调用初始化的方法
        for (Class<? extends IComponentModuleLife> moduleLife : MODULE_LIFES) {
            try {
                moduleLife.newInstance().init(this,isDebug());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    protected abstract void init();
    protected abstract boolean isDebug();

    /**
     * 添加modulelife class
     * @param moduleLifeClass
     */
    protected <T extends IComponentModuleLife> void  addModuleLifeClass(Class<T> moduleLifeClass){
        MODULE_LIFES.add(moduleLifeClass);
    }
}
