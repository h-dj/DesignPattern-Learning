package cn.hdj.decorator;

import java.io.InputStream;

/**
 * @author hdj
 * @Description: 装饰器
 * @Version 1.0
 */
public abstract class SuperCar  implements ICar{
    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }
}


