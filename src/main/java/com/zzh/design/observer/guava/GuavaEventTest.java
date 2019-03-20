package com.zzh.design.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * Created by Tom on 2019/3/17.
 */
public class GuavaEventTest {

    public static void main(String[] args) {
        //消息总线
        EventBus eventBus = new EventBus();
        GuavaMouseListener guavaMouseListener = new GuavaMouseListener();
        PeopleListener peopleListener = new PeopleListener();
        Cat cat = new Cat();
        Dog dog = new Dog();
        eventBus.register(guavaMouseListener);
        eventBus.register(peopleListener);
        eventBus.post(cat);
        eventBus.post(dog);

        //从Struts到SpringMVC的升级
        //因为Struts面向的类，而SpringMVC面向的是方法

        //前面两者面向的是类，Guava面向是方法

        //能够轻松落地观察模式的一种解决方案
        //MQ
    }
}
