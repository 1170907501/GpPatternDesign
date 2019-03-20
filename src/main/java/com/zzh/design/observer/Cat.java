package com.zzh.design.observer;


import java.util.Observable;

public class Cat extends Observable {

    public Cat(){
        this.setChanged();
    }

    public void catCry(){
        //猫叫
        System.out.println("猫大叫一声");
        notifyObservers();
    }
}
