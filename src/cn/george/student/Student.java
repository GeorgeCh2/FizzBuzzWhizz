package cn.george.student;

import cn.george.rule.IRule;

/**
 * Create by Intellij Idea.
 * 学生实体类
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class Student {
    private int id;     //学生对应的数字
    private IRule rule; //调用的规则

    public Student(int id, IRule rule) {
        this.id = id;
        this.rule = rule;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IRule getRule() {
        return rule;
    }

    public void setRule(IRule rule) {
        this.rule = rule;
    }

    //学生报数
    public void report() {
        //进行规则判断，符合指定规则说出相应的单词，否则报数
        System.out.println(rule.result(id));
    }
}
