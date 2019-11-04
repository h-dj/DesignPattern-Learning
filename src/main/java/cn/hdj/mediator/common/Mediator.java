package cn.hdj.mediator.common;

/**
 * @author hdj
 * @version 1.0
 * @date 11/4/19 10:57 PM
 * @description:　中介者接口
 */
public interface Mediator {
    /**
     * 注册同事类
     *
     * @param colleague
     * @param c
     */
    void register(String colleague, Colleague c);

    /**
     * 下达命令
     */
    void commend(String colleague);
}
