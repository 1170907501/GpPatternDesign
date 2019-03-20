package com.zzh.design.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaMouseListener {

    @Subscribe
    public void subscribe(Cat cat){
        cat.cry();
        System.out.println("老鼠吓得抱头鼠窜");
    }

}
