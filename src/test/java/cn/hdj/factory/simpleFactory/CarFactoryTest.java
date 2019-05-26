package cn.hdj.factory.simpleFactory;


import cn.hdj.factory.Audi;
import cn.hdj.factory.Byd;
import cn.hdj.factory.Car;
import org.junit.Test;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 14:51
 * @Description:
 */

public class CarFactoryTest {
    @Test
    public void createCar() throws Exception {
        //不用工厂
        Car audi=new Audi();
        Car byd=new Byd();

        audi.run();
        byd.run();

        //使用工厂
        CarFactory factory=new CarFactory();
        Car audi1 = factory.createCar("Audi");
        audi1.run();

        Car byd1 = factory.createCar("Byd");
        byd1.run();

    }


}
