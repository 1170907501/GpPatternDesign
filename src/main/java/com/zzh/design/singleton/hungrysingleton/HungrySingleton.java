package com.zzh.design.singleton.hungrysingleton;

/**
 * 饿汉式单例
 * 缺点：首次加载就加载实例，有点浪费内存空间
 * 优点：不存在线程安全问题，因为没有加锁，所以执行效率比较高。适用于单例对象较少的情况
 */
public class HungrySingleton {

    private static final HungrySingleton hungrySingleton= new HungrySingleton();

    //私有化构造函数
    private HungrySingleton(){};

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
