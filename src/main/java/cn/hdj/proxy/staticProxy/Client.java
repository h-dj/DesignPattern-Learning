package cn.hdj.proxy.staticProxy;

/**
 * @author hdj
 * @Description: 客户端
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        Star proxyStar =new ProxyStar(realStar);
        proxyStar.confer();
        proxyStar.bookTicket();
        proxyStar.signContract();
        proxyStar.singing();
    }
}
