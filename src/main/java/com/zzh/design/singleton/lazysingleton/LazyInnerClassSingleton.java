package com.zzh.design.singleton.lazysingleton;

/**
 *  静态内部类实现单例
 *  兼顾了饿汉式的内存浪费，又兼顾了Synchronized关键字的缺点
 *  原理：利用了类加载机制，静态内部类
 */
public class LazyInnerClassSingleton {

    //默认使用 LazyInnerClassSingleton 时会先初始化内部类，如果没有使用的时候内部类是不加载的
    private LazyInnerClassSingleton(){
        //为了防止反射造成违反单例的情况，此处加判断，如果已经存在该类实例后，仍通过构造函数获取实例则抛异常
        if(LazyHolder.lazy != null){
            throw new RuntimeException("不允许创建多个实例");
        }

    }

    //不能缺少任何一个关键字  static:使单例的空间共享  final：保证方法不会被重载或重写
    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.lazy;
    }

    private static class LazyHolder {
        private static final LazyInnerClassSingleton lazy = new LazyInnerClassSingleton();
    }

}
