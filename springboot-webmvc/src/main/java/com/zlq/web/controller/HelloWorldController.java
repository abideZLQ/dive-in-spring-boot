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
    public String index(@RequestParam int value, Model model) {
//      model.addAttribute("acceptLanguage",acceptLanguage);
//      model.addAttribute("jsessionId",jsessionId);
//      model.addAttribute("message","Hello,World");
        return "index";
    }
}
