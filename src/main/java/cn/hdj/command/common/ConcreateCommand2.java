package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:32 PM
 * @description:　具体命令者
 */
public class ConcreateCommand2 extends Command{


    //对哪个Receiver类进行命令处理
    private Receiver receiver;

    public ConcreateCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        //执行具体Receiver类的具体业务
        receiver.doSomething();
    }
}
