package cn.george.rule;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class FizzRuleHandler extends RuleHandler {
    public FizzRuleHandler(){}
    @Override
    public void doResult(int number, boolean isHandle) {
        int specialNumber = this.getSpecialNumber();
        String para_result = this.getPara_result();

        if (number % 10 - specialNumber == 0 ||
                (number - (specialNumber * 10) >= 0 &&
                        number - (specialNumber * 10) < 10 && specialNumber != 0)){
            //符合规则6,包含第一个特殊数
            //(个位数为第一个特殊数,十位数为第一个特殊数（在第一个特殊数乘10 ~ 第一个特殊数乘10加9之间））

            System.out.print(para_result);
            //符合规则6，直接退出
            return;
        }

        if (specialNumber != 0 && number % specialNumber == 0) {
            System.out.print(para_result);
            //数字符合规则
            isHandle = true;
        }

        if (getNextHandler() != null) {
            getNextHandler().doResult(number, isHandle);
        }
    }
}
