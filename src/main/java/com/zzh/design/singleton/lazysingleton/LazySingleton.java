package com.zzh.design.singleton.lazysingleton;

public class LazySingleton {
    //私有化构造函数
    private LazySingleton(){};

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return  lazySingleton;
    }
}
