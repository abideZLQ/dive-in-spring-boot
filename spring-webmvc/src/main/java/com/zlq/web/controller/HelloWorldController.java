package com.zlq.web.controller;

import org.springframework.stereotype.Controller;
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
    public String index() {
        return "index";
    }

}
