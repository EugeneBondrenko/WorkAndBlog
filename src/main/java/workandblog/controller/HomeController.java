package workandblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import workandblog.service.ServiceRegistration;

@Controller
public class HomeController {

    @Autowired
    private ServiceRegistration serviceRegistration;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){

        return "index";
    }

    @RequestMapping(name = "/create", method = RequestMethod.GET)
    public String create(){
        String name = "Name";
        String surname = "Sername";
        String email = "@Email";
        String password = "pass";
        String compass = "pass";
        serviceRegistration.create(name, surname, email, password, compass);

        return "redirect:/";
    }



}
