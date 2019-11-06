package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:35 PM
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        //首先声明调用者Invoker
        Invoker invoker = new Invoker();
        //定义接收者
        Receiver receiver = new ConcreateReceiver1();
        //定义一个发送给接收者的命令
        Command command = new ConcreateCommand1(receiver);
        //把命令交给调用者去执行
        invoker.setCommand(command);
        invoker.action();
    }
}
