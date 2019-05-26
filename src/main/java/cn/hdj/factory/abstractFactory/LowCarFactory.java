package cn.hdj.factory.abstractFactory;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:12
 * @Description:
 */
public class LowCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
