package com.zzh.design.observer.gperguava;

import com.google.common.eventbus.Subscribe;

/**
 * guava
 */
public class TeacherListener{
    private String name;
    private Question question;
    public TeacherListener(String name){
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Subscribe
    public void update(GPerSource gPerSource) {
        System.out.println("===============================");
        System.out.println(name + "老师，你好！\n" +
        "您收到了一个来自“" + gPerSource.getName() + "”的提问，希望您解答，问题内容如下：\n" +
        question.getContent() + "\n" +
        "提问者：" + question.getUserName());
    }

}
