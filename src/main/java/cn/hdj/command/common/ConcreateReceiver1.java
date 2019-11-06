package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:29 PM
 * @description: 具体接受者
 */
public class ConcreateReceiver1 extends Receiver{

    //每个接收者都必须处理一定的业务逻辑
    @Override
    public void doSomething() {
        System.out.println("ConcreateReceiver1: 处理业务");
    }
}
