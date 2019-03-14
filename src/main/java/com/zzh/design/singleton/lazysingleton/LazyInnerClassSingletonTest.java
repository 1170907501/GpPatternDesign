package com.zzh.design.singleton.lazysingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class LazyInnerClassSingletonTest {

    public static void main(String[] args) {

        try{
            //用反射破坏单例
            Class<?> clazz = LazyInnerClassSingleton.class;
            Constructor<?> constructor = clazz.getDeclaredConstructor();
            constructor.setAccessible(true);
            Object obj1 = constructor.newInstance();
            Object obj2 =LazyInnerClassSingleton.getInstance();

            System.out.println(obj1==obj2);

        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
