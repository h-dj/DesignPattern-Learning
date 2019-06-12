package cn.hdj.bridge;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Client {

    public static void main(String[] args) {
        //使用桥接模式
        //可以分离了两个变化的维度
        //使得电脑和品牌之间分离继承关系
        //使用组合方式来解耦相互依赖
        Computer computer = new Latop(new Huawei());
        computer.sale();

        Computer computer2 = new Desktop(new Huawei());
        computer2.sale();


    }
}
