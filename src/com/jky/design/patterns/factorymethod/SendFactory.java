package com.jky.design.patterns.factorymethod;

/**
 * @author jky
 * @Create Date 2018-01-16
 * 工厂类
 */
public class SendFactory {
    public Sender produce(String type){
        if("mail".equals(type)){
            return new MailSender();
        }else if("sms".equals(type)){
            return new SmsSender();
        }else{
            System.out.println("请输入正确的类型");
            return null;
        }
    }

    public Sender produceMail(){
        return  new MailSender();
    }

    public Sender producerSms(){
        return new SmsSender();
    }
}
