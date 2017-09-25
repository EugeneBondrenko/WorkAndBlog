package workandblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
        return "createuser";
    }

    @RequestMapping(name = "/createusers", method = RequestMethod.POST)
    private String createuser(
            @RequestParam (value = "name") String name,
            @RequestParam (value = "surname") String surname,
            @RequestParam (value = "email") String email,
            @RequestParam (value = "password") String password,
            @RequestParam (value = "compass") String compass){

        serviceRegistration.create(name, surname, email, password, compass);
        return "index";
    }



}
