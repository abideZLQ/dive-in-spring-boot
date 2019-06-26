package com.zlq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * HelloWorld {@link Controller}
 *
 * @author zlq
 * @since 2019/06/24
 */
@Controller
public class HelloWorldController {

    /**
     * 映射到根路径
     */
    @RequestMapping("")
    public String index(Model model) {
//      model.addAttribute("acceptLanguage",acceptLanguage);
//      model.addAttribute("jsessionId",jsessionId);
//      model.addAttribute("message","Hello,World");
        return "index";
    }

    @ModelAttribute("message")
    public String message(){
        return "Hello,World";
    }

    @ModelAttribute("acceptLanguage")
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    @ModelAttribute("jsessionId")
    public String jsessionId(@CookieValue("zlq") String jsessionId){
        return jsessionId;
    }

}
