package cn.hdj.visitor.common;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 12:01
 * @description: 访问者接口
 */
public interface IVisitor {

    /**
     * 定义可以访问哪些元素
     *
     * @param element
     */
    void visit(ConcreateElement1 element);

    void visit(ConcreateElement2 element);
}
