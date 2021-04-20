package com.vastika.uim.util;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;

public class EmailUtil {

    public static final String FROM_EMAIL = "shresthaashish1@gmail.com";

    public static void sendEmail(String toEmail, String subject, String content, MailSender mailSender){
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setFrom(FROM_EMAIL);
        mailMessage.setTo(toEmail);
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        mailSender.send(mailMessage);
        System.out.println("Mail Send Successfully");

    }
}
