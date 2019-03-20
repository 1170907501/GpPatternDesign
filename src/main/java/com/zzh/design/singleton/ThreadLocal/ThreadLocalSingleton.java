package com.zzh.design.singleton.ThreadLocal;

/**
 * Created by Tom.
 * 伪线程安全，线程内是单例，但是多个线程间不是单例
 * 使用ThreadLocal实现数据源动态切换
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            new ThreadLocal<ThreadLocalSingleton>(){
                @Override
                protected ThreadLocalSingleton initialValue() {
                    return new ThreadLocalSingleton();
                }
            };

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance(){
        return threadLocalInstance.get();
    }
}
