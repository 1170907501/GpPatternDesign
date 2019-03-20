package com.zzh.design.observer.gperguava;

import com.zzh.design.observer.gperadvice.GPer;
import com.zzh.design.observer.gperadvice.Question;

public class GPerSource {

    private String name = "GPer生态圈";
    private static GPerSource gPerSource = null;
    private GPerSource(){}

    public static GPerSource getInstance(){
        if(null == gPerSource){
            gPerSource = new GPerSource();
        }
        return gPerSource;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
    }
}
