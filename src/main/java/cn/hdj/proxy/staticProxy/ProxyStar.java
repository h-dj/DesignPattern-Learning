package cn.hdj.proxy.staticProxy;

/**
 * @author hdj
 * @Description: 经纪人
 * @Version 1.0
 */
public class ProxyStar implements  Star{

    private Star realStar;

    public ProxyStar(Star realStar) {
        this.realStar = realStar;
    }

    @Override
    public void confer() {
        System.out.println("经纪人谈合同");
    }

    @Override
    public void signContract() {
        System.out.println("经纪人签合同");
    }

    @Override
    public void bookTicket() {
        System.out.println("经纪人订票");
    }

    @Override
    public void singing() {
       realStar.singing();
    }
}
