package cn.hdj.prototype;

import org.junit.Test;

import java.io.*;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Auther: hdj
 * @Date: 2019/5/28 10:37
 * @Description:
 */
public class SheepTest implements Serializable {

    /**
     * 浅拷贝
     *
     * @throws Exception
     */
    @Test
    public void shallowClone() throws Exception {

        Date date = new Date(1111111233L);
        Sheep sheep1 = new Sheep();
        sheep1.setName("多利");
        sheep1.setBirthday(date);
        System.out.println(sheep1);


        //拷贝对象
        Sheep sheep2= sheep1.clone();
        sheep2.setName("少利");

        //修改日期对象
        date.setTime(1231231564654L);

        //因为使用Object的本地方法clone进行拷贝，是浅拷贝
        //只能拷贝的对象属性的地址引用
        System.out.println(sheep2);
        System.out.println(sheep1);
    }


    @Test
    public void  deepClone() throws CloneNotSupportedException {

        Date date = new Date(1111111233L);
        Sheep2 sheep1 = new Sheep2();
        sheep1.setName("多利");
        sheep1.setBirthday(date);
        System.out.println(sheep1);

        //拷贝对象
        //因为实现了深拷贝，所以改变日期对象的值
        //不会使拷贝对象受到影响
        Sheep2 sheep2= (Sheep2) sheep1.clone();
        sheep2.setName("少利");

        //修改日期对象
        date.setTime(1231231564654L);

        System.out.println(sheep1);
        System.out.println(sheep2);

    }

    /**
     * 采用序列化实现深拷贝
     *
     */
    @Test
    public void deepCloneBySerializable() throws IOException, ClassNotFoundException {

        Date date = new Date(1111111233L);
        Sheep3 sheep1 = new Sheep3();
        sheep1.setName("多利");
        sheep1.setBirthday(date);
        System.out.println(sheep1);


        //序列化拷贝对象
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos =new ObjectOutputStream(bos);
        oos.writeObject(sheep1);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis=new ByteArrayInputStream(bytes);
        ObjectInputStream ois=new ObjectInputStream(bis);
        Sheep3 sheep2= (Sheep3) ois.readObject();

        sheep2.setName("少利");
        //修改日期对象
        date.setTime(1231231564654L);

        //因为使用Object的本地方法clone进行拷贝，是浅拷贝
        //只能拷贝的对象属性的地址引用
        System.out.println(sheep2);
        System.out.println(sheep1);
    }
}