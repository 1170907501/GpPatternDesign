package com.zzh.design.singleton;

import com.zzh.design.singleton.lazysingleton.LazySingleton;

public class ExecutorThread implements Runnable{
    @Override
    public void run() {

        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+lazySingleton);
    }
}
