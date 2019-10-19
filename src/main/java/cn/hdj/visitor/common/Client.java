package cn.hdj.visitor.common;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 12:05
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        Visitor visitor = new Visitor();
        for (int i = 0; i < 10; i++) {
            //获得元素对象
            Element el = ObjectStruture.createElement();
            //接受访问者访问
            el.accept(visitor);
        }
    }
}
