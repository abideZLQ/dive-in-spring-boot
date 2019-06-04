package com.zlq.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * {@link SpringApplication} 引导类
 *
 * @author zlq
 * @since 2019/6/4
 */
public class SpringApplicationBootstrap {

//    public static void main(String[] args) {
//        // run之后不可以增加参数了，所以想要修改配置，可以调整API配置
//        // SpringApplication.run(ApplicationConfiguration.class,args);
//
//        Set<String> sources = new HashSet();
//        // 配置 Class 名称
//        sources.add(ApplicationConfiguration.class.getName());
//        SpringApplication springApplication = new SpringApplication();
//        springApplication.setSources(sources);
//        // 推断类型
//        springApplication.setWebApplicationType(WebApplicationType.NONE);
//        ConfigurableApplicationContext context = springApplication.run(args);
//        System.out.println("Bean : " + context.getBean(ApplicationConfiguration.class) );
//    }

    public static void main(String[] args) {
        // run之后不可以增加参数了，所以想要修改配置，可以调整API配置
        // SpringApplication.run(ApplicationConfiguration.class,args);

        Set<String> sources = new HashSet();
        // 配置 Class 名称
        sources.add(ApplicationConfiguration.class.getName());
        SpringApplication springApplication = new SpringApplication();
        springApplication.setSources(sources);
        springApplication.run(args);
    }

    @SpringBootApplication
    public static class ApplicationConfiguration{

    }
}
