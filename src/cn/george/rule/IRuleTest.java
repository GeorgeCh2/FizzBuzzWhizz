package cn.george.rule;

import org.junit.jupiter.api.Test;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2017/6/23
 */
class IRuleTest {
    @Test
    void result() {
        IRule rule = new RuleImpl(2, 3, 5);
        System.out.println(rule.result(1));
        System.out.println(rule.result(10));
        System.out.println(rule.result(28));
        System.out.println(rule.result(37));
        System.out.println(rule.result(45));
        System.out.println(rule.result(70));
        System.out.println(rule.result(99));
    }

}