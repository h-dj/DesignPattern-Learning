package cn.hdj.mediator.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 11:09 PM
 * @description:
 */
public class ConcreteColleague2 implements Colleague {

    private Mediator mediator;

    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void selfMethod() {
        System.out.println("ConcreteColleague2：　做自己的业务");
    }

    @Override
    public void depMethod(String arg) {
        //自己不能处理的业务逻辑,要ConcreteColleague1帮忙，委托给中介者处理
        System.out.println("ConcreteColleague2: 自己不能处理的业务逻辑,要ConcreteColleague1帮忙，委托给中介者处理");
        mediator.commend(arg);
    }
}
