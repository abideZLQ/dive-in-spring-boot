package com.zlq.web.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * {@link HelloWorldController} 通知
 *
 * @author zlq
 * @since 2019/06/26
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {
    // model.addAttribute("message","Hello,World");
    @ModelAttribute("message")
    public String message(){
        return "Hello,World";
    }

    // model.addAttribute("acceptLanguage",acceptLanguage);
    @ModelAttribute("acceptLanguage")
    // 获取请求头中"Accept-Language"的值
    public String acceptLanguage(@RequestHeader("Accept-Language") String acceptLanguage){
        return acceptLanguage;
    }

    // model.addAttribute("jsessionId",jsessionId);
    @ModelAttribute("jsessionId")
    // 获取Cookie中"zlq"的值
    public String jsessionId(@CookieValue("zlq") String jsessionId){
        return jsessionId;
    }

    // 括号里面代表拦截的异常类型
    @ExceptionHandler(Throwable.class)
    // 参数代表需要处理的异常,可以是自定义异常
    public ResponseEntity<String> onException(Throwable throwable){
        // ok代表返回的响应码,ok等于200; throwable.getMessage()是异常信息
        return ResponseEntity.ok(throwable.getMessage());
    }
}