package pl.biomechanika.formularz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FormularzApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FormularzApplication.class, args);

        MailService mailService = context.getBean(MailService.class);

        mailService.sendMail("antmaster@byom.de", "Nowy kopiec nadchodzi", "Witajcie mrówczarze, budujemy  14 kopiec");
        mailService.sendMail("blt_50fknfcfc60o@byom.de", "Nowy kopiec nadchodzi", "Witajcie mrówczarze, budujemy  14 kopiec");

    }

}
