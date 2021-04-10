package pl.biomechanika.formularz;

import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private JavaMailSender javaMailSender;

    public MailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public void sendMail(String receiver, String title, String content) {

        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo(receiver);
        mail.setFrom("janektester@interia.pl");
        mail.setSubject(title);
        mail.setText(content);

        javaMailSender.send(mail);


    }
}
