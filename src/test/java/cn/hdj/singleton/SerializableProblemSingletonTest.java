package cn.hdj.singleton;


import org.junit.Test;

import java.io.*;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 11:31
 * @Description: 测试单例序列化
 */

public class SerializableProblemSingletonTest {


    @Test
    public void test() throws Exception {
        SerializableProblemSingleton singleton = SerializableProblemSingleton.getSingleton();
        System.out.println(singleton);

        File file = new File(".\\src\\main\\resources\\obj.txt");
        //序列化对象
        ObjectOutput output = new ObjectOutputStream(new FileOutputStream(file));
        output.writeObject(singleton);
        output.flush();
        output.close();

        //反序列化对象
        ObjectInput input = new ObjectInputStream(new FileInputStream(file));
        singleton = (SerializableProblemSingleton) input.readObject();
        System.out.println(singleton);
        input.close();

        /**
         * 输出结果
         * cn.hdj.singleton.SerializableProblemSingleton@3b764bce
         * cn.hdj.singleton.SerializableProblemSingleton@6ed3ef1
         */
    }

}
