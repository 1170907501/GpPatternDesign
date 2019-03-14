package com.zzh.design.proxy.dynamicproxy.gpproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 手写 实现动态代理
 */
public class GPMeipo implements GPInvocationHandler {
    private Object target;
    public Object getInstance(Object obj){
        this.target = obj;
        Class<?> clazz = target.getClass();
        return GPProxy.newProxyInstance(new GPClassLoader(),clazz.getInterfaces(),this);
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
