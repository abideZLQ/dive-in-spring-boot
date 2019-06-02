package com.zlq.diveinspringboot.bootstrap;

import com.zlq.diveinspringboot.annotation.EnableHelloWorld;
import com.zlq.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * {@link EnableHelloWorld} 引导类
 *
 * @author zlq
 * @since 2019/6/2
 */
@EnableHelloWorld
public class EnableHelloWorldBootstrap {

    public static void main(String[] args) {
        // 获取context上下文对象(类似于Spring的获取上文下对象new ClassPathXmlApplicationContext("配置文件");不同点：内嵌server容器)
        ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // helloWorld Bean 是否存在
        // type ：getBean返回值的类型
        String helloWorld = context.getBean("helloWorld",String.class);

        System.out.println("helloWorld Bean : " + helloWorld);

        // 关闭上下文
        context.close();

    }
}
