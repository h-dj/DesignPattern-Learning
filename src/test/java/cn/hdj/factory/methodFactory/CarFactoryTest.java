package cn.hdj.factory.methodFactory;

import cn.hdj.factory.Car;
import cn.hdj.factory.factoryMethod.AudiCarFactory;
import cn.hdj.factory.factoryMethod.BydCarFactory;
import org.junit.Test;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 14:53
 * @Description:
 */
public class CarFactoryTest {

    @Test
    public void createCar() throws Exception {
        //使用方法工厂创建车
        Car audi = new AudiCarFactory().createCar();
        audi.run();

        Car byd = new BydCarFactory().createCar();
        byd.run();
    }

}