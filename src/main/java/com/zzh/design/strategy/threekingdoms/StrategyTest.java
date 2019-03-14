package com.zzh.design.strategy.threekingdoms;

public class StrategyTest {

    public static void main(String[] args) {

        StrategyContext context = new StrategyContext();
        System.out.println("话说孙权谎称请刘备娶自己的妹妹为妻，实则作为人质要回荆州");
        System.out.println("诸葛亮苦劝，怎奈刘备色迷心窍，执意要去。诸葛亮给赵云3条计谋，说危机时刻顺序打开");
        System.out.println("刘备、赵云到了吴国，大张旗鼓说来取吴国太女儿，孙权想杀刘备，危机时刻赵云打开第一条计策");
        context.strategyList.get(0).openStrategy();
        System.out.println("吴国太痛批孙权");
        System.out.println("刘备乐不思蜀，危机时刻赵云打开第二条计策");
        context.strategyList.get(1).openStrategy();
        System.out.println("周瑜派兵追杀");
        context.strategyList.get(2).openStrategy();
        System.out.println("刘备安然回蜀国");
    }
}
