package com.zzh.design.observer.guava;

import com.google.common.eventbus.Subscribe;

public class PeopleListener {

    @Subscribe
    public void subscribe(Cat cat){
        cat.cry();
        System.out.println("主人翻身继续睡觉");
    }
    @Subscribe
    public void subscribe(Dog dog){
        dog.cry();
        System.out.println("主人起身一个拖鞋扔了过去");
    }
}
