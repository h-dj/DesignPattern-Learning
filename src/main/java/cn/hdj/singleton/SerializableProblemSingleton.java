package cn.hdj.singleton;

import java.io.Serializable;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 11:28
 * @Description: 反序列化单例，重新new一个对象的问题
 * <p>
 * 注意序列化对象一定要实现Serializable接口
 */
public class SerializableProblemSingleton implements Serializable {
    private static volatile SerializableProblemSingleton instance;
    private SerializableProblemSingleton() {
        if (instance != null) {
            throw new RuntimeException("instance is not null!");
        }
    }

    public static SerializableProblemSingleton getSingleton() {
        if (instance == null) {
            synchronized (DCLSingleton.class) {
                if (instance == null) {
                    instance = new SerializableProblemSingleton();
                }
            }
        }
        return instance;
    }


    /**
     * java.io.ObjectInputStream#readOrdinaryObject(boolean) ：反序列化对象，会重新new一个对象 obj
     * java.io.ObjectStreamClass#hasReadResolveMethod() ：判断是否用定义readResolve()方法
     * java.io.ObjectStreamClass#invokeReadResolve(java.lang.Object) ： 使用反射执行该方法，返回实例的引用 instance，
     * 如果obj != instance ; obj = instance ;从而达到引用同一个对象
     *
     * @return
     */
    private Object readResolve() {
        return instance;
    }
}
