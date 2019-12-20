package com.lianwei.yazi;

import com.lee.base.BaseConstants;

/**
 * Author ：le
 * Date ：2019-11-18 13:45
 * Description ：静态常量变量存储类
 */
public class Constants extends BaseConstants {

    //debug变量也可以通过gradle的多渠道打包的方式，通过AndroidManifest的meta-data标签获取配置值，这样就不用担心打生产包的时候还需要修改debug值
    public static final boolean IS_DEBUG = true;

}
