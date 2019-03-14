package com.zzh.design.prototype.shallow;

public class Client {

    //注入Propotype
    private Propotype propotype;
    public Client(Propotype propotype){
        this.propotype = propotype;
    }

    public Propotype startClone(){
        return propotype.clone();
    }
}
