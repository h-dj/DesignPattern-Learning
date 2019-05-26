package cn.hdj.factory.abstractFactory;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:03
 * @Description:
 */
public class LuxuryTyre implements Tyre {
    @Override
    public void resolve() {
        System.out.println("耐磨");
    }
}
