package cn.george.teacher;

import cn.george.rule.BuzzRuleHandler;
import cn.george.rule.FizzRuleHandler;
import cn.george.rule.WhizzRuleHandler;

/**
 * Create by Intellij Idea.
 * 体育老师实体类
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class Teacher {
    public static void main(String[] args){
        int []numbers = {3, 5, 7};
        String []results = {"Fizz", "Buzz", "Whizz"};

        FizzRuleHandler fizz = new FizzRuleHandler(numbers[0], results[0]);
        BuzzRuleHandler buzz = new BuzzRuleHandler(numbers[1], results[1]);
        WhizzRuleHandler whizz = new WhizzRuleHandler(numbers[2], results[2]);

        fizz.setNextHandler(buzz);
        buzz.setNextHandler(whizz);

        for (int i = 1; i <= 100; i ++) {
            fizz.doResult(i,false);
            System.out.println();
        }
    }
}
