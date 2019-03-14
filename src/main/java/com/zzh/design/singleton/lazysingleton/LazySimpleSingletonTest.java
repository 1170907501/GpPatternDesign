package com.zzh.design.singleton.lazysingleton;

import com.zzh.design.singleton.ConcurrentExecutor;
import com.zzh.design.singleton.ExecutorThread;

public class LazySimpleSingletonTest {


    public static void main(String[] args) {


        Thread t1 = new Thread(new ExecutorThread());
        Thread t2 = new Thread(new ExecutorThread());
        t1.start();
        t2.start();

        System.out.println("end");
    }
}
