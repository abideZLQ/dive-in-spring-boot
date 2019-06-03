package com.zlq.diveinspringboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 配置
 *
 * @author zlq
 * @since 2019/6/2
 */
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String helloWorld(){ // 方法名即 Bean 名称
        return "Hello,World 2018";
    }

}
