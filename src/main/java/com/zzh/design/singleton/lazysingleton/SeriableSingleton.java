package com.zzh.design.singleton.lazysingleton;

import java.io.Serializable;

/**
 * 可序列化的单例
 */
public class SeriableSingleton implements Serializable{

    //序列化：指的是把内存的状态通过字节码的形式转换为IO流后，存储到（网络IO或磁盘中）从而保存内存状态
    //反序列化：持久化的字节码内容，转换为 IO 流，通过 IO 流的读取，进而将读取的内容转换为 Java 对象。在转换过程中重建对象
    private static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance() {
        return seriableSingleton;
    }

    private Object readResolve(){return seriableSingleton;}
}
