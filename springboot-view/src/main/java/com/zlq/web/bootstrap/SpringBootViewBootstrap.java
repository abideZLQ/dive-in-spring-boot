package com.zlq.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot 视图引导类
 *
 * @author zlq
 * @since 2019/7/8
 */
@SpringBootApplication(scanBasePackages = "com.zlq.web")
public class SpringBootViewBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootViewBootstrap.class,args);
    }

}
