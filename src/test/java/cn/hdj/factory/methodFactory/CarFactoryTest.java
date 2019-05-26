package cn.hdj.factory.methodFactory;

import cn.hdj.factory.Car;
import org.junit.Test;

import static org.junit.Assert.*;

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