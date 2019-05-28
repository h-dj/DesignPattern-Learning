package cn.hdj.prototype;

import java.io.Serializable;
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
public class Sheep3 implements Serializable {
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

}
