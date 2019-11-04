package cn.hdj.mediator.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 11:00 PM
 * @description:
 */
public interface Colleague {

    /**
     * 自身业务方法
     */
    void selfMethod();

    /**
     * 依赖方法
     */
    void depMethod(String arg);
}
