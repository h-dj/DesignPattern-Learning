package cn.hdj.proxy.dynamicProxy.jdk;

import cn.hdj.proxy.staticProxy.ProxyStar;
import cn.hdj.proxy.staticProxy.RealStar;
import cn.hdj.proxy.staticProxy.Star;

import java.lang.reflect.Proxy;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //代理处理器
        StarHandler handler=new StarHandler(new RealStar());
        //创建代理
        //参数
        //类加载器
        //被代理类的接口，必须
        //处理器
        Star proxyStar= (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{Star.class},handler );

        proxyStar.confer();
        proxyStar.bookTicket();
        proxyStar.signContract();
        proxyStar.singing();
    }
}
