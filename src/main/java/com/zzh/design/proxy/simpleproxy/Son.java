package com.zzh.design.proxy.simpleproxy;

import com.zzh.design.proxy.IPerson;

public class Son implements IPerson {
    @Override
    public void findLove() {
        System.out.println("对象要求：肤白、貌美、气质佳！");
    }
}
