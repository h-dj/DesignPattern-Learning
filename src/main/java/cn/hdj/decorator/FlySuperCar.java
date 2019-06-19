package cn.hdj.decorator;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class FlySuperCar extends SuperCar {
    public FlySuperCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        car.move();
        fly();
    }

    public void fly(){
        System.out.println("能飞的车");
    }

}
