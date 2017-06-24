package cn.george.test;

import cn.george.rule.BuzzRuleHandler;
import cn.george.rule.FizzRuleHandler;
import cn.george.rule.WhizzRuleHandler;

import java.util.Scanner;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2017/6/24
 */
public class InputTest {
    public static void main(String[] args){
        System.out.println("请输入3个特殊数字：");
        Scanner scanner = new Scanner(System.in);
        int num_1 = scanner.nextInt();
        int num_2 = scanner.nextInt();
        int num_3 = scanner.nextInt();

        FizzRuleHandler fizz = new FizzRuleHandler();
        BuzzRuleHandler buzz = new BuzzRuleHandler();
        WhizzRuleHandler whizz = new WhizzRuleHandler();

        fizz.setSpecialNumber(num_1);
        fizz.setPara_result("Fizz");
        fizz.setNextHandler(buzz);

        buzz.setSpecialNumber(num_2);
        buzz.setPara_result("Buzz");
        buzz.setNextHandler(whizz);

        whizz.setSpecialNumber(num_3);
        whizz.setPara_result("Whizz");

        for (int i = 1; i <= 100; i++) {
            fizz.doResult(i, false);
            System.out.println();
        }
    }
}
