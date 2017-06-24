package cn.george.rule;

/**
 * Create by Intellij Idea.
 * 规则基类
 * 采用责任链模式
 * @Auhtor George
 * @Create on 2017/6/23
 */
abstract class RuleHandler {
    //下一个规则责任处理对象
    private RuleHandler nextHandler;

    //特殊数字
    private int specialNumber;

    //对应单词
    private String para_result;

    //数字是否符合规则
    private boolean isHandle = false;

    public RuleHandler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(RuleHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public int getSpecialNumber() {
        return specialNumber;
    }

    public void setSpecialNumber(int specialNumber) {
        this.specialNumber = specialNumber;
    }

    public String getPara_result() {
        return para_result;
    }

    public void setPara_result(String para_result) {
        this.para_result = para_result;
    }

    //规则处理
    public abstract void doResult(int number, boolean isHandle);
}
