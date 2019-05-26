package cn.hdj.factory.methodFactory;

import cn.hdj.factory.Audi;
import cn.hdj.factory.Car;

/**
 * @Auther: hdj
 * @Date: 2019/5/23 22:55
 * @Description:
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
