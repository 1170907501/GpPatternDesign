package com.zzh.design.strategy.threekingdoms;

import java.util.ArrayList;
import java.util.List;

public class StrategyContext {

    public static List<IStrategy> strategyList = new ArrayList<>();
    static {
        strategyList.add(new StrategyA());
        strategyList.add(new StrategyB());
        strategyList.add(new StrategyC());
    }
}
