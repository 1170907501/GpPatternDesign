package com.zzh.design.delegate.simple;

public class EmployeeB implements IEmployee{
    @Override
    public void doSomething(String command) {
        System.out.println("我是员工B,我擅长加密，我正在执行"+command);
    }
}
