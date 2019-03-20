package com.zzh.design.observer;

import java.util.Observable;
import java.util.Observer;

public class People implements Observer{

    /**
     * 观察者
     * @param o
     * @param arg
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("翻了个身继续睡");
    }
}
