package com.zzh.design.singleton.hungrysingleton;

public class HungrySingletonTest {

    public static void main(String[] args) {

        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();

        System.out.println(hungrySingleton1==hungrySingleton2);
    }

}
