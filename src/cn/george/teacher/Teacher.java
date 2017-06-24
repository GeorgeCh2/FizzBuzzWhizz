package cn.george.teacher;

import cn.george.rule.FizzRuleHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Create by Intellij Idea.
 * 体育老师实体类
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class Teacher {
    public static void main(String[] args){
        String[] locations = {"applicationContext.xml"};
        ApplicationContext context = new ClassPathXmlApplicationContext(locations);

        FizzRuleHandler fizz = (FizzRuleHandler) context.getBean("fizzRule");

        for (int i = 1; i <= 100; i ++) {
            fizz.doResult(i,false);
            System.out.println();
        }
    }
}
