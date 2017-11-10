package workandblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import workandblog.service.MailService;

@Controller
public class sendMessageController {

    @Autowired
    MailService mailService;


    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send() {

        mailService.sendEmailAfterRegistration("maksym.lishchynskyi@gmail.com","Ты почему дома сидишь? Ищи работу тунеядец))))");
        return "workAndBlog";
    }
}
