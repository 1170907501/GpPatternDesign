/*
package com.zzh.design.template;

*/
/**
 * 模板方法模式：可以运用jdk1.8的新特性 default 关键字修饰的默认方法实现模板模式
 *
 *//*

public interface Trave {
        default void execute() {
            System.out.println("旅游开始了。。。");
            // 1、攻略
            pre();
            // 2、订票、订酒店
            post();
            // 3、旅游路线
            trave();
            // 4、回家
            goHome();
            System.out.println("旅游结束。。。");
        }

        default void goHome(){
            System.out.println("回家");
        };

        void trave();

        void post();

        void pre();
}
*/
