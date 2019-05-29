package cn.hdj.adapter;

/**
 * @Auther: hdj
 * @Date: 2019/5/29 11:10
 * @Description: 适配器
 * 1. 可以采用继承或组合的形式进行适配对象
 */
public class Adapter extends  Adaptee implements Target{
    @Override
    public void handler() {
        super.request();
    }
}
