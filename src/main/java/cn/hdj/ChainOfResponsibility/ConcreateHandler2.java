package cn.hdj.ChainOfResponsibility;

/**
 * @author hdj
 * @version 1.0
 * @date 11/10/19 5:48 PM
 * @description:
 */
public class ConcreateHandler2 extends Handler {

    //定义自己的处理逻辑
    protected Response echo(Request request) {
        //完成处理逻辑
        return null;
    }
    //设置自己的处理级别
    protected Level getHandlerLevel() {
        //设置自己的处理级别
        return null;
    }
}
