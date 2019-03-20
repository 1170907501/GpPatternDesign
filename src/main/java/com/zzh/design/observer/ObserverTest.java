package com.zzh.design.observer;

public class ObserverTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        People lisi = new People();
        Mouse mouse = new Mouse();
        cat.addObserver(lisi);
        cat.addObserver(mouse);

        cat.catCry();
    }
}
