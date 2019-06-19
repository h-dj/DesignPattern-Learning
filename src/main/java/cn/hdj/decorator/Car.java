package cn.hdj.decorator;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Car implements ICar {

    @Override
    public void move() {
        System.out.println("能在陆地跑的车！");
    }
}
