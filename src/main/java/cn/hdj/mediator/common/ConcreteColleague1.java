package cn.hdj.mediator.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 11:06 PM
 * @description:
 */
public class ConcreteColleague1  implements Colleague{

    private Mediator mediator;

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void selfMethod() {
        System.out.println("ConcreteColleague1：　做自己的业务");
    }

    @Override
    public void depMethod(String arg) {
        //自己不能处理的业务逻辑,要ConcreteColleague2帮忙，委托给中介者处理
        System.out.println("ConcreteColleague1: 自己不能处理的业务逻辑，委托给中介者处理");
        mediator.commend(arg);
    }
}
