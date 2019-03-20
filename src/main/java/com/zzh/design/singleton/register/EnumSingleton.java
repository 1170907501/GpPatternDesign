package com.zzh.design.singleton.register;

import java.io.Serializable;

public enum  EnumSingleton implements Serializable{

    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
