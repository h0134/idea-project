package com.JWT.JWT.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    @Autowired
    private JavaMailSender mailSender;
    @Autowired
    EmailBodyBuilder emailBodyBuilder;

    public void sendSimpleEmail(String toEmail, String subject, String body) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("harmanpreet.kaur@tothenew.com");
        message.setTo(toEmail);
        message.setText(emailBodyBuilder.build(body));
        message.setSubject(subject);
        mailSender.send(message);
        System.out.println("Mail Send...");
    }


}
