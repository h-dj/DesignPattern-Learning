package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:28 PM
 * @description: 命令接受者
 */
public abstract class Receiver {

    //抽象接收者，定义每个接收者都必须完成的业务
    public abstract void doSomething();
}
