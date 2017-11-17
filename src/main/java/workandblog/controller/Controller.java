//package workandblog.controller;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//import workandblog.entity.UserRegistration;
//import workandblog.service.ServiceRegistration;
//
//import java.util.ArrayList;
//
//@org.springframework.stereotype.Controller
//public class Controller {
//
//    @Autowired
//    private ServiceRegistration serviceRegistration;
//
//
//    @RequestMapping(value = "/remove", method = RequestMethod.GET)
//    public String removeUser() {
//        int id = 6;
//        serviceRegistration.removeBook(id);
//        return "index";
//    }
//
//    @RequestMapping("/edit")
//    public String editUser(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", serviceRegistration.getUserById(id));
//        model.addAttribute("listUsers", serviceRegistration.userList());
//        return "userList";
//    }
//
//    @RequestMapping(value = "/user", method = RequestMethod.GET)
//    public String userData(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", serviceRegistration.getUserById(id));
//        return "userData";
//    }
//
//
//    @RequestMapping(value = "/1", method = RequestMethod.GET)
//    public ModelAndView test1() {
//
//      /*  UserRegistration userRegistration = serviceRegistration.getUserById(1);*/
//
//
//        ArrayList<UserRegistration> userRegistrations = (ArrayList<UserRegistration>) serviceRegistration.userList();
//
//        ModelAndView modelAndView = new ModelAndView("index");
//
//        modelAndView.addObject("key", new Integer(4444));
//        modelAndView.addObject("UserRegistrations", userRegistrations);
//
//        return modelAndView;
//    }
//
//
//    @RequestMapping(value = "/2", method = RequestMethod.GET)
//    public ModelAndView test2() {
//        serviceRegistration.removeBook(9);
//        return new ModelAndView("index");
//    }
//}
