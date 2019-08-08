package com.zlq.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Rest 引导类
 *
 * @author zlq
 * @since 2019/7/22
 */
@SpringBootApplication(scanBasePackages = {
        "com.zlq.web.controller",
        "com.zlq.web.config"
})
public class SpringBootRestBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestBootstrap.class,args);
    }

}
