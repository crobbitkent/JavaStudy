package org.zerock;

import org.zerock.mail.MailConfig;
import org.zerock.mail.MailSender;

public class Main {

    public static void main(String[] args) {

        MailConfig mailConfig = new MailConfig("crobbitkent@gmail.com","Zpsxm5779!");

        MailSender mailSender = new MailSender(mailConfig);

        mailSender.sendMail();
    }
}
