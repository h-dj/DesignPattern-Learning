package cn.hdj.mediator.common;

import java.lang.reflect.Method;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 10:40 PM
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();

        Colleague colleague1=new ConcreteColleague1(mediator);
        Colleague colleague2=new ConcreteColleague2(mediator);

        mediator.register("concreteColleague1",colleague1);
        mediator.register("concreteColleague2",colleague2);

        colleague1.selfMethod();
        colleague1.depMethod("concreteColleague2");


    }
}
