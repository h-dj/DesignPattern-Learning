package cn.hdj.singleton;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @Description: 饿汉单例模式
 * @date 2019/5/22 13:05
 * @Version 1.0
 *
 * 是否 Lazy 初始化：否
 * 是否多线程安全：是
 * 实现难度：易
 */
public class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getInstance() {
        return instance;
    }
}
