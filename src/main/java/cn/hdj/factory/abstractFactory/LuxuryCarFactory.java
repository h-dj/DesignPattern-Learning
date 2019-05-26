package cn.hdj.factory.abstractFactory;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:12
 * @Description:
 */
public class LuxuryCarFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
