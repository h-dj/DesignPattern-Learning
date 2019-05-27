package cn.hdj.singleton;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @Description:
 * @date 2019/5/22 13:08
 * @Version 1.0
 * <p>
 * JDK 版本：JDK1.5 起
 * 是否 Lazy 初始化：是
 * 是否多线程安全：是
 * 实现难度：较复杂
 */
public class DCLSingleton {

    /**
     * volatile保持线程间的可见性,阻止指令重排
     * 在没有初始化完成之前，不能赋值
     */
    private static volatile DCLSingleton instance;

    private DCLSingleton() {
    }

    public static DCLSingleton getSingleton() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new DCLSingleton();
                }
            }
        }
        return instance;
    }
}
