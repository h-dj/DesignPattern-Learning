package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:34 PM
 * @description: 调用者，　执行具体命令
 */
public class Invoker {

    private Command command;
    //受气包，接受命令
    public void setCommand(Command _command){
        this.command = _command;
    }
    //执行命令
    public void action(){
        this.command.execute();
    }
}
