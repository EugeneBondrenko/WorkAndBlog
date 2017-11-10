package workandblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {

   private int pass;
   private String password1;

    private static final int WEAK_STRENGTH = 1;
    private static final int FEAR_STRENGTH = 5;
    private static final int STRONG_STRENGTH = 7;

    private static final String WEAK_COLOR = "#FF0000";
    private static final String FEAR_COLOR = "#FF9900";
    private static final String STRONG_COLOR = "#00FF00";


    @RequestMapping(value = "/check", method = RequestMethod.GET, produces = {"text/html; charset=UTF-8"})
    public @ResponseBody
    String checkStrength(@RequestParam String password) {
           pass = password.length();
           password1 = new String(password);

        String result = "<span style=\"color:%s; font-weight:bold;\">%s</span>";

        if (password.length() >= WEAK_STRENGTH & password.length() < FEAR_STRENGTH) {
            // добавить локализацию
            return String.format(result,WEAK_COLOR,"Слабый");
        } else if (password.length() >= FEAR_STRENGTH & password.length() < STRONG_STRENGTH) {
            return String.format(result, FEAR_COLOR,"Средний");
        } else if (password.length() >= STRONG_STRENGTH) {
            return String.format(result, STRONG_COLOR,"Сильный");
        }
        //если пользователь все символы удалил возвращам пустоту
        return "";
    }


    @RequestMapping(value = "/identical", method = RequestMethod.GET, produces = {"text/html; charset=UTF-8"})
    public @ResponseBody
    String identical(@RequestParam String compass) {

        String result = "<span style=\"color:%s; font-weight:bold;\">%s</span>";

            if (compass != null){

                if (compass.length() == pass & compass.equals(password1)){
                    return String.format(result,STRONG_COLOR,"Password identical");
                } else if (compass.length() >= pass & !compass.equals(password1)){
                    return String.format(result, WEAK_COLOR,"Password no identical");
                }
                return null;
            }
            return "";
    }


//    @RequestMapping(value = "/form", method = RequestMethod.GET)
//    private String form(){
//                return "registration";
//}


    @RequestMapping(value = "/form", method = RequestMethod.GET)
    private String list(){
        return "workAndBlog";
    }
}