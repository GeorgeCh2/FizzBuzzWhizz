package cn.george.rule;

/**
 * Create by Intellij Idea.
 * 规则接口实现类
 * @Auhtor George
 * @Create on 2017/6/23
 */
public class RuleImpl implements IRule {
    //3个特殊数
    private int num_1;
    private int num_2;
    private int num_3;

    //对应单词
    private String result_1 = "Fizz";
    private String result_2 = "Buzz";
    private String result_3 = "Whizz";


    public RuleImpl(int num_1, int num_2, int num_3) {
        this.num_1 = num_1;
        this.num_2 = num_2;
        this.num_3 = num_3;
    }

    @Override
    public String result(int number) {
        //结果
        String result = "";

        //是否符合规则
        boolean isRuled = false;

        if (number % 10 - num_1 == 0 ||
                (number - (num_1 * 10) >= 0 && number - (num_1 * 10) < 10)){
            //符合规则6,包含第一个特殊数
            //(个位数为第一个特殊数,十位数为第一个特殊数（在第一个特殊数乘10 ~ 第一个特殊数乘10加9之间））

            result = result_1;
            isRuled = true;
        } else {
            if (number % num_1 == 0) {
                result += result_1;
                isRuled = true;
            }

            if (number % num_2 == 0) {
                result += result_2;
                isRuled = true;
            }

            if (number % num_3 == 0) {
                result += result_3;
                isRuled = true;
            }
        }

        if (!isRuled) {
            result = number + "";
        }

        return result;
    }
}
