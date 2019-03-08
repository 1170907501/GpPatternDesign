package com.zzh.design.simplefactory;

public class MilkFactory {
    public IMilk getMilk(String milkNm){
        if("MNMilk".equals(milkNm)){
            return new MNMilk();
        }else if("TLSMilk".equals(milkNm)){
            return  new TLSMilk();
        }
        return new MNMilk();
    }
}
