package cn.hdj.ChainOfResponsibility;

/**
 * @author hdj
 * @version 1.0
 * @date 11/10/19 5:54 PM
 * @description:
 */
public class Client {

    public static void main(String[] args) {
        ConcreateHandler1 concreateHandler1=new ConcreateHandler1();
        ConcreateHandler2 concreateHandler2=new ConcreateHandler2();

        concreateHandler1.setNext(concreateHandler2);
        concreateHandler1.handleMessage(new Request());
    }
}
