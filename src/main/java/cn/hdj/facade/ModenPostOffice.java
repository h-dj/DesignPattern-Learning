package cn.hdj.facade;

/**
 * @author hdj
 * @Description: 门面类，对外提供统一接口
 * @Version 1.0
 */
public class ModenPostOffice {


    private ILetterProcess letterProcess =new ILetterProcessImpl();

    public void sendLetter(String context,String address){
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        letterProcess.letterEnvelope();
        letterProcess.sendLetter();
    }


}
