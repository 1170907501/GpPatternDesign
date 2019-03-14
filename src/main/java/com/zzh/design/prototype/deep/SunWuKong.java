package com.zzh.design.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * 孙悟空
 */
public class SunWuKong extends Monkey implements Cloneable,Serializable{

    private JinGuBang jinGuBang;

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    private Object deepClone(){
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            SunWuKong copy = (SunWuKong)ois.readObject();
            copy.birthDay = new Date();
            return copy;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public SunWuKong shallowClone(SunWuKong target){

        SunWuKong qiTianDaSheng = new SunWuKong();
        qiTianDaSheng.name = target.name;
        qiTianDaSheng.hight = target.hight;

        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.birthDay = new Date();
        return  qiTianDaSheng;
    }
}
