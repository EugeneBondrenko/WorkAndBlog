package workandblog.controller.UserBankSystem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import workandblog.entity.UserInfo;

@Controller
@SessionAttributes(types = UserInfo.class)
public class UserBankSystem {


    @RequestMapping(value = "/custom",method = RequestMethod.GET)
    private String startUserBankSystem(Model model){
        model.addAttribute(new UserInfo());
        return "customerUser";
    }

    @RequestMapping(value = "/customer1", method = RequestMethod.POST)
    private String customerUser(UserInfo info, SessionStatus status){

        System.out.println(info.getName());
        System.out.println(info.getSurname());
        System.out.println(info.getEmail());
        System.out.println(info.getCompanyName());
        System.out.println(info.getCountryName());
        System.out.println(info.getCityName());
        System.out.println(status.isComplete());

        return "customerConfirm";
    }

}
