package cn.hdj.visitor.common;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 11:39
 * @description: 访问者实现
 */
public class Visitor implements IVisitor {

    /**
     * 访问ConcreateElement1具体业务操作
     *
     * @param element
     */
    @Override
    public void visit(ConcreateElement1 element) {
        element.doSomething();
    }

    @Override
    public void visit(ConcreateElement2 element) {
        element.doSomething();
    }
}
