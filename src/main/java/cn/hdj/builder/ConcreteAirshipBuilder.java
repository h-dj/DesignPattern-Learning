package cn.hdj.builder;

/**
 * @Auther: hdj
 * @Date: 2019/5/27 10:43
 * @Description:
 */
public class ConcreteAirshipBuilder implements AirshipBuilder {
    @Override
    public Engine builderEngine() {
        System.out.println("构建引擎");
        return new Engine();
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule();
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower();
    }
}
