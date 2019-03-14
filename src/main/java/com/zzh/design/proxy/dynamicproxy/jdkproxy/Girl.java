package com.zzh.design.proxy.dynamicproxy.jdkproxy;

import com.zzh.design.proxy.IPerson;

public class Girl implements IPerson{

    @Override
    public void findLove(){
        System.out.println("要求：高富帅，暖男");
    }
}
