package com.zzh.design.proxy.dynamicproxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * jdk 实现动态代理
 */
public class JDKMeipo implements InvocationHandler {
    private Object target;
    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object object = method.invoke(this.target,args);
        after();
        return object;
    }

    // 前置增强
    private void before(){
        System.out.println("我是媒婆，我要给你找对象，现在已经确认你的需求");
        System.out.println("开始物色");
    }
    //后置增强
    private void after(){
        System.out.println("OK的话，准备办事");
    }
}
