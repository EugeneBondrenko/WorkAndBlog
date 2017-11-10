package workandblog.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import workandblog.entity.User;
import workandblog.service.UserService;

import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserService userService;


//    @RequestMapping(value = "/remove", method = RequestMethod.GET)
//    public String removeUser() {
//        int id = 6;
//        userService.removeUser(id);
//        return "index";
//    }

    @RequestMapping("/edit")
    public String editUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        model.addAttribute("listUsers", userService.userList());
        return "userList";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String userData(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getUserById(id));
        return "userData";
    }


//    @RequestMapping(value = "/1", method = RequestMethod.GET)
//    public ModelAndView test1() {
//
//      /*  User userRegistration = userService.getUserById(1);*/
//
//
//        ArrayList<User> users = (ArrayList<User>) userService.userList();
//
//        ModelAndView modelAndView = new ModelAndView("index");
//
//        modelAndView.addObject("key", new Integer(4444));
//        modelAndView.addObject("UserRegistrations", users);
//
//        return modelAndView;
//    }


//    @RequestMapping(value = "/2", method = RequestMethod.GET)
//    public ModelAndView test2() {
//        userService.removeUser(9);
//        return new ModelAndView("index");
//    }
}
