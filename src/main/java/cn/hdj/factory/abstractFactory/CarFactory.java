package cn.hdj.factory.abstractFactory;

import javax.swing.*;

/**
 * @Auther: hdj
 * @Date: 2019/5/26 15:11
 * @Description:
 */
public interface CarFactory {
    Engine createEngine();
    Seat createSeat();
    Tyre createTyre();
}
