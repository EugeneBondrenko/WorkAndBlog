package workandblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import workandblog.service.MailService;

@org.springframework.stereotype.Controller
public class TestController {

    @Autowired
    MailService mailService;

    @RequestMapping(value = "/send", method = RequestMethod.GET)
    public String send() {

        mailService.sendEmailAfterRegistration("o.grument@gmail.com","hi");
        return  "list";
    }


}
