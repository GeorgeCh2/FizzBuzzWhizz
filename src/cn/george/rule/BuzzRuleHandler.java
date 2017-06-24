package cn.george.rule;

/**
 * Create by Intellij Idea.
 *
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class BuzzRuleHandler extends RuleHandler {

    @Override
    public void doResult(int number, boolean isHandle ) {
        int specialNumber = this.getSpecialNumber();
        String para_result = this.getPara_result();

        if(specialNumber != 0 && number % specialNumber == 0) {
            System.out.print(para_result);
            isHandle = true;
        }

        if (getNextHandler() != null) {
            getNextHandler().doResult(number, isHandle);
        }
    }
}
