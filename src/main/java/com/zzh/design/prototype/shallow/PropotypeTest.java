package com.zzh.design.prototype.shallow;

import java.util.ArrayList;
import java.util.List;

public class PropotypeTest {

    public static void main(String[] args) {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        List<String> hobbies = new ArrayList<>();
        prototypeA.setAge(18);
        prototypeA.setName("tom");
        hobbies.add("游泳");
        hobbies.add("健身");
        hobbies.add("跑步");
        prototypeA.setHobbies(hobbies);

        //浅克隆，引用类型属性的地址相同
        Client client = new Client(prototypeA);
        ConcretePrototypeA copy = (ConcretePrototypeA)client.startClone();
        System.out.println(prototypeA.getHobbies() == copy.getHobbies());
    }
}
