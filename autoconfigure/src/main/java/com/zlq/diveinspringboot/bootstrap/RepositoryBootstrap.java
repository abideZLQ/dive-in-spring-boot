package com.zlq.diveinspringboot.bootstrap;

import com.zlq.diveinspringboot.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.zlq.diveinspringboot.repository")
public class RepositoryBootstrap {

    public static void main(String[] args) {
        // 获取context上下文对象(类似于Spring的获取上文下对象new ClassPathXmlApplicationContext("配置文件");不同点：内嵌server容器)
        ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootstrap.class)
                .web(WebApplicationType.NONE)
                .run(args);

        // 获取bean(name,type), myFirstLevelRepository Bean 是否存在
        // type ：getBean返回值的类型
        MyFirstLevelRepository myFirstLevelRepository =
                context.getBean("myFirstLevelRepository",MyFirstLevelRepository.class);

        // 打印
        System.out.println("myFirstLevelRepository Bean : "+myFirstLevelRepository);

        // 关闭上下文
        context.close();

    }
}
