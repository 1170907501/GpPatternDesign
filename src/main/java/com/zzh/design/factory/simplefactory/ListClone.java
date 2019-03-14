package com.zzh.design.factory.simplefactory;

import java.io.*;
import java.util.List;

public class ListClone implements Cloneable,Serializable{

    private List<Object> listA;
    public ListClone(List<Object> targetList){
        this.listA = targetList;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }
    public Object deepClone() {
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(listA);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            List<Object> copy = (List<Object>) ois.readObject();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
