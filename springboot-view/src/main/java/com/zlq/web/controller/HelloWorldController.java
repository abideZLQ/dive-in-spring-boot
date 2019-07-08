package com.zlq.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * HelloWorld {@link Controller}
 *
 * @author zlq
 * @since 2019/7/8
 */
@Controller
public class HelloWorldController {

    /**
     * 映射到根路径
     */
    @RequestMapping("")
    public String index(@RequestParam(required = false,defaultValue = "0") int value, Model model) {
        return "index";
    }

    @GetMapping("/hello-world")
    public String index(){
        return "hello-world"; // View 逻辑名称
    }

    @ModelAttribute("message")
    public String message(){
        return "HelloWorld";
    }

}
