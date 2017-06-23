package cn.george.teacher;

import cn.george.rule.IRule;
import cn.george.rule.RuleImpl;
import cn.george.student.Student;

/**
 * Create by Intellij Idea.
 * 体育老师实体类
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class Teacher {
    public static void main(String[] args){
        IRule rule = new RuleImpl(3, 5, 7);
        for (int i = 1; i <= 100; i++) {
            Student student = new Student(i, rule);
            student.report();
        }
    }
}
