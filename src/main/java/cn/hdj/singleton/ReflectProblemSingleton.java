package cn.hdj.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author hdj
 * @ClassName: DesignPattern-Learning
 * @Description: 通过反射破解单例
 * @date 2019/5/23 13:28
 * @Version 1.0
 */
public class ReflectProblemSingleton {

    private static volatile ReflectProblemSingleton instance;

    private ReflectProblemSingleton() {
        //判断是否已实例化，抛出异常，防止通过反射来构造新的实例
        if (instance != null) {
            throw new RuntimeException("instance is not null!");
        }
    }

    public static ReflectProblemSingleton getInstance() {
        if (instance == null) {
            synchronized (ReflectProblemSingleton.class) {
                if (instance == null) {
                    instance = new ReflectProblemSingleton();
                }
            }
        }
        return instance;
    }
}
