package com.zzh.design.singleton.lazysingleton;

/**
 * 懒汉式单例：双重锁检查
 * 关键点：1、构造方法私有化
 *         2、私有化自身变量，用于返回调用方
 *         3、公开获去单例对象的方法
 *         4、首先判断单例对象是否为空，如果不为空则直接返回，为空则进入内部构造
 *         （目的是：高并发的情况下，过滤调绝大多数进入同步块的情况，提高效率）
 *         5、添加对象锁，目的高并发线程安全--不会获取多个实例
 *         6、执行双重检查是因为，如果多个线程同时了通过了第一次检查，并且其中一个线程首先通过了第二次检查并实例化了对象，那么剩余通过了第一次检查的线程就不会再去实例化对象
 */
public class LazyDoubleCheckSingleton {
    //双重锁检查 懒汉式单例
    private LazyDoubleCheckSingleton doubleCheckSingleton;

    private LazyDoubleCheckSingleton(){}

    /**
     * 双重锁检查：因为有锁，所以多少还是会影响性能
     * 更好的方案：静态内部类
     * @return
     */
    public LazyDoubleCheckSingleton getInstance() {
        if(doubleCheckSingleton == null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(doubleCheckSingleton == null){
                    doubleCheckSingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return doubleCheckSingleton;
    }
}
