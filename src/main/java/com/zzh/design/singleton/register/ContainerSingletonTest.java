package com.zzh.design.singleton.register;

import com.zzh.design.singleton.ConcurrentExecutor;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        try{
            ConcurrentExecutor.execute(new ConcurrentExecutor.RunHandler() {
                @Override
                public void handler() {
                    Object object = ContainerSingleton.getBean("com.zzh.design.singleton.register.Pojo");
                    System.out.println(System.currentTimeMillis()+":"+object);
                }
            },10,6);

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
