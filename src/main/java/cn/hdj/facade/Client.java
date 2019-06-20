package cn.hdj.facade;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class Client{

    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        modenPostOffice.sendLetter("Hello!", "985号街46");
    }
}
