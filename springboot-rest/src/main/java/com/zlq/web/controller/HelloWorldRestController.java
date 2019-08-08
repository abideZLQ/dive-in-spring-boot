package com.zlq.web.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloWorld {@link RestController} 实现
 *
 * @author zlq
 * @since 2019/7/22
 */
@RestController
public class HelloWorldRestController {

    @GetMapping(value = "/hello-world")
    public String helloWorld(@RequestParam(required = false) String message){
        return "Hello,World! : " + message;
    }


    // http://api.rest.org:8080/hello，相同的地址不过跨了个域
    // CrossOrigin会在响应头中设置Access-Control-Allow-Origin:*
    // *号表示所有的域名都可以访问我这个地址
    // @CrossOrigin("*")
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }
}
