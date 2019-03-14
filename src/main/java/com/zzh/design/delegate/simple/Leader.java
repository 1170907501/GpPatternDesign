package com.zzh.design.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{

    private static Map<String,IEmployee> employeeMap = new HashMap<>();

    static {
        employeeMap.put("单点登录",new EmployeeA());
        employeeMap.put("加密",new EmployeeB());
    }

    @Override
    public void doSomething(String command) {
        employeeMap.get(command).doSomething(command);
    }
}
