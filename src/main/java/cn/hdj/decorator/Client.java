package cn.hdj.decorator;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Car car=new Car();

        car.move();

        FlySuperCar flySuperCar=new FlySuperCar(car);
        flySuperCar.move();

        FlySuperCar flySuperCar1=new FlySuperCar(new AISuperCar(car));
        flySuperCar1.move();
    }
}
