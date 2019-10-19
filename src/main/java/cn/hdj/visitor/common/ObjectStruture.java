package cn.hdj.visitor.common;

import java.util.Random;

/**
 * @author hdj
 * @version 1.0
 * @date 2019/10/19 12:03
 * @description:
 */
public class ObjectStruture {

    /**
     * 这里采用工厂方法构造对象元素
     *
     * @return
     */
    public static Element createElement() {
        Random rand = new Random();
        if (rand.nextInt(100) > 50) {
            return new ConcreateElement1();
        } else {
            return new ConcreateElement2();
        }
    }
}
