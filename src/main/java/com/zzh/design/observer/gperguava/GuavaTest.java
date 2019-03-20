package com.zzh.design.observer.gperguava;

import com.google.common.eventbus.EventBus;

public class GuavaTest {

    public static void main(String[] args) {

        EventBus eventBus = new EventBus("GuavaGper");
        GPerSource gPerSource = GPerSource.getInstance();
        TeacherListener tom = new TeacherListener("tom");
        TeacherListener mic = new TeacherListener("mic");
        Question question = new Question();
        question.setContent("如何使用guava实现咕泡社区场景？");
        question.setUserName("ms简单");
        tom.setQuestion(question);
        mic.setQuestion(question);

        eventBus.register(tom);
        eventBus.register(mic);

        System.out.println(question.getUserName() + "在" + gPerSource.getName() + "上提交了一个问题。");
        eventBus.post(gPerSource);

    }
}
