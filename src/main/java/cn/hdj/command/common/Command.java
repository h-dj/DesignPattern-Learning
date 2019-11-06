package cn.hdj.command.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/6/19 10:31 PM
 * @description: 命令者
 */
public abstract class Command {

    //每个命令类都必须有一个执行命令的方法
    public abstract void execute();
}
