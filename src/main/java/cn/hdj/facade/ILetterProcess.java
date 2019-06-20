package cn.hdj.facade;

/**
 * @author hdj
 * @Description: 写信过程
 * @Version 1.0
 */
public interface ILetterProcess {

    void writeContext(String context);
    void fillEnvelope(String address);
    void letterEnvelope();
    void sendLetter();
}
