package cn.hdj.visitor.common;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 11:38
 * @description: 抽象元素
 */
public abstract class Element {
    /**
     * 业务处理
     */
    public abstract void doSomething();

    /**
     * 定义谁来访问
     * 一般： visitor.visit(this)
     *
     * @param visitor
     */
    public abstract void accept(Visitor visitor);
}
