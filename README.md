# FizzBuzzWhizz  
##### 环境  
win10 + jdk1.8 + intelli idea  

##### 运行步骤  
1.下载jar包(https://github.com/GeorgeCh2/FizzBuzzWhizz/blob/master/out/artifacts/FizzBuzzWhizz_jar/FizzBuzzWhizz.jar)
2.切换到jar包路径下 

`
java -jar FizzBuzzWhizz.jar
`  

![alt](http://georgechou.cn/content/images/2017/06/fizz.PNG)

##### 实现  
1. 使用责任链模式，将“包含第一个特殊数”和“能被第一个特殊数整除”放在第一个责任中 
    包含第一个特殊数跳出责任链，否则向下执行，进入下一责任
2. 第二个责任中为“能被第二个特殊数整除”  
    继续执行下一职责  
3. 第三个责任中为“能被第三个特殊数整除”  
    判断数字是否被处理过，如果没被处理，则输出数字
    
--------
父类RuleHandler.java
```
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
```

第一个责任 FizzRuleHandler.java

```
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
```

