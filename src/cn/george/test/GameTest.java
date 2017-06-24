package cn.george.test;

import cn.george.rule.BuzzRuleHandler;
import cn.george.rule.FizzRuleHandler;
import cn.george.rule.WhizzRuleHandler;
import org.junit.jupiter.api.Test;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class GameTest {
    @Test
    public void test01() {
        //正常数据
        int []numbers = {3, 5, 7};
        test(numbers);
    }

    @Test
    public void test02() {
        //数据颠倒
        int []numbers = {5, 3, 7};
        test(numbers);
    }

    @Test
    public void test03() {
        //相同数据
        int []numbers = {3, 3, 3};
        test(numbers);
    }

    @Test
    public void test04() {
        //全是1
        int []numbers = {1, 1, 1};
        test(numbers);
    }

    @Test
    public void test05() {
        int []numbers = {1, 2, 3};
        test(numbers);
    }


    @Test
    public void test06() {
        int []numbers = {2, 4, 8};
        test(numbers);
    }

    @Test
    public void test07() {
        int []numbers = {4, 2, 8};
        test(numbers);
    }

    @Test
    public void test08() {
        int []numbers = {0, 5, 7};
        test(numbers);
    }


    private void test(int []numbers) {
        String []results = {"Fizz", "Buzz", "Whizz"};

        FizzRuleHandler fizz = new FizzRuleHandler();
        BuzzRuleHandler buzz = new BuzzRuleHandler();
        WhizzRuleHandler whizz = new WhizzRuleHandler();

        fizz.setSpecialNumber(numbers[0]);
        fizz.setPara_result(results[0]);
        fizz.setNextHandler(buzz);

        buzz.setSpecialNumber(numbers[1]);
        buzz.setPara_result(results[1]);
        buzz.setNextHandler(whizz);

        whizz.setSpecialNumber(numbers[2]);
        whizz.setPara_result(results[2]);

        for (int i = 1; i <= 100; i ++) {
            fizz.doResult(i,false);
            System.out.println();
        }
    }
}
