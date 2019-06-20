package cn.hdj.facade;

/**
 * @author hdj
 * @Description: TODO
 * @Version 1.0
 */
public class ILetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("写信内容:" + context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写信封信息，填写地址：" + address);
    }

    @Override
    public void letterEnvelope() {
        System.out.println("装入信封");
    }

    @Override
    public void sendLetter() {
        System.out.println("发信");
    }
}
