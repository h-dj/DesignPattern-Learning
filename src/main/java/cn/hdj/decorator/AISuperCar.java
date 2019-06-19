package cn.hdj.decorator;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class AISuperCar extends SuperCar  {

    public AISuperCar(ICar car) {
        super(car);
    }

    @Override
    public void move() {
        car.move();
        this.autoMove();
    }

    public void autoMove(){
        System.out.println("能自动驾驶的车！");
    }
}

