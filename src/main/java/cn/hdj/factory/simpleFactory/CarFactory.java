package cn.hdj.factory.simpleFactory;


import cn.hdj.factory.Audi;
import cn.hdj.factory.Byd;
import cn.hdj.factory.Car;

/**
 * @Auther: hdj
 * @Date: 2019/5/23 22:20
 * @Description: 简单工厂
 * <p>
 * 不满足开闭原则
 */
public class CarFactory {

    public Car createCar(String carType) {
        if ("Audi".equals(carType))
            return new Audi();
        if ("Byd".equals(carType))
            return new Byd();
        else
            throw new RuntimeException("This car not created!");
    }
}
