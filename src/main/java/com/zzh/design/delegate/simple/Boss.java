package com.zzh.design.delegate.simple;

public class Boss {

    public static void doCommand(String command,Leader leader){
        leader.doSomething(command);
    }
}
