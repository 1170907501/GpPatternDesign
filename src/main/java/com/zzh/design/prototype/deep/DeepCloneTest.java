package com.zzh.design.prototype.deep;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DeepCloneTest {

    public static void main(String[] args) {
        SunWuKong qiTianDaSheng = new SunWuKong();
        JinGuBang jinGuBang = new JinGuBang();
        qiTianDaSheng.setJinGuBang(jinGuBang);
        try {
            SunWuKong clone = (SunWuKong)qiTianDaSheng.clone();
            System.out.println("深克隆：" + (qiTianDaSheng.getJinGuBang() == clone.getJinGuBang()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        SunWuKong q = new SunWuKong();
        SunWuKong n = q.shallowClone(q);
        System.out.println("浅克隆：" + (q.getJinGuBang() == n.getJinGuBang()));

        //ArrayList copy功能
        ArrayList list1 = new ArrayList();
        list1.add("afdsadf");
        list1.add(qiTianDaSheng);
        ArrayList copyList = (ArrayList)list1.clone();
        System.out.println(copyList.get(1) == copyList.get(1));
    }


}
