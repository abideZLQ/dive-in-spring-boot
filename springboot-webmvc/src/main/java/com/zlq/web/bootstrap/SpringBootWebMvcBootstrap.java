package com.zlq.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot Web MVC 引导类
 *
 * @author zlq
 * @since 2019/7/2
 */
@SpringBootApplication(scanBasePackages = "com.zlq.web")
public class SpringBootWebMvcBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootWebMvcBootstrap.class, args);
    }
}
