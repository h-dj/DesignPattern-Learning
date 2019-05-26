package cn.hdj.singleton;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @date 2019/5/22 13:15
 * @Version 1.0
 * @Description: 使用静态内部类实现单例
 *
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是（利用类加载保证线程安全）
 * 实现难度：一般
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
