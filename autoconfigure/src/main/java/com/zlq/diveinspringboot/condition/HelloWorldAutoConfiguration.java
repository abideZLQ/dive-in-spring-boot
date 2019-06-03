package com.zlq.diveinspringboot.condition;

import com.zlq.diveinspringboot.annotation.EnableHelloWorld;
import org.springframework.context.annotation.Configuration;

/**
 * HelloWorld 自动装配
 *
 * @author 小马哥
 * @since 2018/5/15
 */
@Configuration // Spring 模式注解装配
@EnableHelloWorld // Spring @Enable 模块装配
@ConditionalOnSystemProperty(name = "user.name", value = "Administrator") // 条件装配
public class HelloWorldAutoConfiguration {
}
