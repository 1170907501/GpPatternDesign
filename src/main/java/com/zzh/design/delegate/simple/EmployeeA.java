package com.zzh.design.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doSomething(String command) {
        System.out.println("我是员工A，我擅长单点登录，我正在执行"+command);
    }
}
