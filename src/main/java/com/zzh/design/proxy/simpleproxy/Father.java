package com.zzh.design.proxy.simpleproxy;

import com.zzh.design.proxy.IPerson;

public class Father implements IPerson{
    private IPerson son;

    public Father(IPerson son){
        this.son = son;
    }
    @Override
    public void findLove() {
        before();
        son.findLove();
        after();
    }

    // 前置增强
    private void before(){
        System.out.println("前置增强");
    }
    //后置增强
    private void after(){
        System.out.println("后置增强");
    }
}
