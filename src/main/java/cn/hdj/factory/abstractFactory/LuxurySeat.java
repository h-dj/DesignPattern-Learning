package cn.hdj.factory.abstractFactory;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:10
 * @Description:
 */
public class LuxurySeat implements Seat {
    @Override
    public void msg() {
        System.out.println("可以按摩！");
    }
}
