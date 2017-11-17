package workandblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import workandblog.service.MailService;

@org.springframework.stereotype.Controller
public class TestController {

    @Autowired
    MailService mailService;

//    @RequestMapping(value = "/send", method = RequestMethod.GET)
//    public String send() {
//
//        mailService.sendEmailAfterRegistration("maksym.lishchynskyi@gmail.com","Ты почему дома сидишь? Ищи работу тунеядец))))");
//        return "workAndBlog";
//    }

//    @RequestMapping(value = "/test1", method = RequestMethod.GET)
//    public String authorizationUser(){
//        return "authorizationUser";
//    }

//    @RequestMapping(value = "/test2", method = RequestMethod.GET)
//    public String authorizationUser(){
//        return "menuTest";
//    }
//
//
//    @RequestMapping(value = "/test3", method = RequestMethod.GET)
//    public String positionTest(){
//        return "positionTest";
//    }

//    @RequestMapping(value = "/menuList", method = RequestMethod.GET)
//    public String menuList(){
//        return "menuList";
//    }


}
