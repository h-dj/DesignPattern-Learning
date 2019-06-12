package cn.hdj.proxy.staticProxy;

/**
 * @author hdj
 * @Description: 真实明星
 * @Version 1.0
 */
public class RealStar implements Star {
    @Override
    public void confer() {
    }

    @Override
    public void signContract() {

    }

    @Override
    public void bookTicket() {

    }

    @Override
    public void singing() {
        System.out.println("真实明星唱歌！！");
    }
}
