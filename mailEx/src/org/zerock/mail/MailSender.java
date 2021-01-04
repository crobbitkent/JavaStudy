package org.zerock.mail;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailSender {

    private Session session;
    private MailConfig mailConfig;

    public MailSender(final MailConfig mailConfig){

        this.mailConfig = mailConfig;
        session =
                Session.getDefaultInstance(mailConfig.getPorps(),
                        new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(mailConfig.getMailAddress(),
                                mailConfig.getMailPassword());
                    }
                });
    }

    public void sendMail(){
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(mailConfig.getMailAddress()));

            //�닔�떊�옄硫붿씪二쇱냼
            message.addRecipient(Message.RecipientType.TO, new InternetAddress("fdddfddd@naver.com"));

            // Subject 제목
            message.setSubject("Test mingyu"); //硫붿씪 �젣紐⑹쓣 �엯�젰

            // Text 내용
            message.setText("Test mingyu");    //硫붿씪 �궡�슜�쓣 �엯�젰

            // send the message
            Transport.send(message); ////�쟾�넚
            System.out.println("message sent successfully...");
        } catch (AddressException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (MessagingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
