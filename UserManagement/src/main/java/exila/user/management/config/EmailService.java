package exila.user.management.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import exila.user.management.utility.Utility;

@Component
public class EmailService {

    @Autowired
    private JavaMailSender emailSender;

    public void sendMessage(
      String to, Long otp) {
        
        SimpleMailMessage message = new SimpleMailMessage(); 
        message.setFrom("jayant9140@gmail.com");
        message.setTo(to); 
        message.setSubject(Utility.MAIL_SUBJECT); 
        message.setText(Utility.MESSAGE+" "+otp);
        emailSender.send(message);
        
    }
}