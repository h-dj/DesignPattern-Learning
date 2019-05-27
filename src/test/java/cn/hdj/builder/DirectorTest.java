package cn.hdj.builder;

import org.junit.Test;

/**
 * @Auther: hdj
 * @Date: 2019/5/27 10:44
 * @Description:
 */
public class DirectorTest {

    @Test
    public void directAirship() throws Exception {
        AirshipDirector director=new AirshipDirector(new ConcreteAirshipBuilder());
        Airship airship = director.directAirship();
        System.out.println(airship);
    }

}