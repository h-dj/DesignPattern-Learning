package cn.hdj.builder;

/**
 * @Auther: hdj
 * @Date: 2019/5/27 10:40
 * @Description: 飞船装配者
 */
public class AirshipDirector {
    private AirshipBuilder builder;

    public AirshipDirector(AirshipBuilder builder) {
        this.builder = builder;
    }

    public Airship directAirship() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        Airship airship = new Airship();
        airship.setEngine(engine);
        airship.setEscapeTower(escapeTower);
        airship.setOrbitalModule(orbitalModule);
        return airship;
    }
}
