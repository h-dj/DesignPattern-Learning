package cn.hdj.proxy.dynamicProxy.jdk;

import cn.hdj.proxy.staticProxy.RealStar;
import cn.hdj.proxy.staticProxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hdj
 * @Description: 处理器
 * @Version 1.0
 */
public class StarHandler implements InvocationHandler {

    /**
     * 真实对象
     */
    private Star realStar;

    public StarHandler(Star realStar) {
        this.realStar = realStar;
    }

    /**
     *
     * @param proxy  代理的对象
     * @param method 执行的方法
     * @param args  参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if("singing".equals(method.getName())){
            method.invoke(realStar,args);
        }
        return null;
    }
}
