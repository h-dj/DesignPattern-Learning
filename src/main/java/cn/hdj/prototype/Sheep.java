package cn.hdj.prototype;

import java.util.Date;

/**
 * @Auther: hdj
 * @Date: 2019/5/27 10:57
 * @Description: 羊
 * <p>
 * 实现拷贝
 * 1. 实现拷贝接口Cloneable
 * 2. 重写clone()方法
 */
public class Sheep implements Cloneable {
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
     *直接使用super.clone()进行拷贝，是浅拷贝的形式
     * 如果拷贝对象里有属性的类型是对象类型,如Date, 只能拷贝对象的引用地址
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }
}
