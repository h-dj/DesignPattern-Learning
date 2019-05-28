package cn.hdj.prototype;

import java.util.Date;

/**
 * @Auther: hdj
 * @Date: 2019/5/28 10:46
 * @Description: 实现深拷贝
 */
public class Sheep2 implements Cloneable{


    private String name;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    /**
     *实现深拷贝
     * 1. 在拷贝对象的同时，也对属性对象进行拷贝
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //拷贝对象
        Sheep2 sheep2 = (Sheep2) super.clone();
        //对象里的Date属性也进行拷贝
        Date birthday2 = (Date) this.birthday.clone();
        sheep2.setBirthday(birthday2);
        return sheep2;
    }
}
