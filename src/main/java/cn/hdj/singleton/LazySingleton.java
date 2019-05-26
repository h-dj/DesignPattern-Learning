package cn.hdj.singleton;

import java.io.Serializable;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @Description: 懒汉式
 * @date 2019/5/22 12:59
 * @Version 1.0
 * <p>
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：易
 */
public class LazySingleton implements Serializable{

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance1() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}