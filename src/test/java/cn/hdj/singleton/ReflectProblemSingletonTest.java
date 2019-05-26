package cn.hdj.singleton;


import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 11:22
 * @Description: 测试反射重新new一个对象，破解单例
 */

public class ReflectProblemSingletonTest {

    @Test
    public void getInstance() throws Exception {
        ReflectProblemSingleton singleton1 = ReflectProblemSingleton.getInstance();
        ReflectProblemSingleton singleton2 = ReflectProblemSingleton.getInstance();

        System.out.println(singleton1);
        System.out.println(singleton2);

        //通过反射实例化新的对象
        Constructor<ReflectProblemSingleton> constructor = ReflectProblemSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        ReflectProblemSingleton singleton3 = constructor.newInstance();

        System.out.println(singleton3);

        /**
         * 输出结果 ： 防止反射重新new对象，可以在构造方法中判断是否已实例化
         * cn.hdj.singleton.ReflectProblemSingleton@3b764bce
         *cn.hdj.singleton.ReflectProblemSingleton@3b764bce
         *cn.hdj.singleton.ReflectProblemSingleton@759ebb3d
         */
    }


}
