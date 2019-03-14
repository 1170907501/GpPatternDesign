package com.zzh.design.proxy.simpleproxy;

public class SimpleProxyTest {

    public static void main(String[] args) {

        Father father = new Father(new Son());
        father.findLove();
    }
}
