package cn.hdj.singleton;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @Description: 使用枚举创建单例
 * @date 2019/5/22 13:21
 * @Version 1.0
 * <p>
 * 避免多线程同步问题
 * 防止反序列化重新创建新的对象， 也可重写readResolve()
 * <p>
 * 缺点：无延迟加载
 */
public enum EnumSingleton {
    INSTANCE;
}
