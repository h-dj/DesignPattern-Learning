package cn.hdj.visitor.common;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 11:42
 * @description: 实际元素1
 */
public class ConcreateElement1 extends Element {

    @Override
    public void doSomething() {
        System.out.println("ConcreateElement1.doSomething");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
