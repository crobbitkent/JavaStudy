package org.kent.mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.kent.mail.MailConfig;

// service class
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
	
	// 메일을 보낸다.
	public boolean sendMail(MessageDTO message) {
		boolean result = false;
		
		 try {
	            MimeMessage mimeMessage = new MimeMessage(session);
	            mimeMessage.setFrom(new InternetAddress(mailConfig.getMailAddress()));

	            // 보낼 ID
	            mimeMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getTo()));
	            // Subject 제목
	            mimeMessage.setSubject(message.getTitle()); //硫붿씪 �젣紐⑹쓣 �엯�젰

	            // Text 내용
	            mimeMessage.setText(message.getContent());    //硫붿씪 �궡�슜�쓣 �엯�젰

	            // send the message
	            Transport.send(mimeMessage); ////�쟾�넚
	            System.out.println("message sent successfully...");
	            result = true;
	        } catch (AddressException e) {
	            // TODO Auto-generated catch block
	        	result = false;
	            e.printStackTrace();
	        } catch (MessagingException e) {
	            // TODO Auto-generated catch block
	        	result = false;
	            e.printStackTrace();
	        } catch (Exception e) {
	        	result = false;
	            e.printStackTrace();
	        }
		
		
		return result;
	}
}
