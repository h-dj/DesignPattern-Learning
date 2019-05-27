package cn.hdj.builder;

/**
 * @Auther: hdj
 * @Date: 2019/5/27 10:36
 * @Description: 飞船构建器
 *
 * 
 */
public interface AirshipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
