package com.zzh.design.delegate.simple;

public class DelegateTest {

    public static void main(String[] args) {
        Boss.doCommand("单点登录",new Leader());
        Boss.doCommand("加密",new Leader());
    }
}
