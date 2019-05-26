package cn.hdj.factory.abstractFactory;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:02
 * @Description:
 */
public class LowTyre implements Tyre {
    @Override
    public void resolve() {
        System.out.println("磨损快");
    }
}
