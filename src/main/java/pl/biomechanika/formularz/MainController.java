package pl.biomechanika.formularz;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private final MailService mailService;

    public MainController(MailService mailService) {
        this.mailService = mailService;
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/regulamin")
    public String regulamin() {
        return "regulamin";
    }

    @GetMapping("/kontakt")
    public String kontakt() {
        return "kontakt";
    }

    @PostMapping("/send")
    @ResponseBody
    public String composeMail(String senderName, String senderMail, String messageText) {
        mailService.sendMail("antmaster@byom.de", senderName, messageText);
        return "You sent email.";
    }


}
