package com.zlq.diveinspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//@ServletComponentScan(basePackages = "com.zlq.diveinspringboot.web.servlet")
public class DiveInSpringBootApplication {

	public static void main(String[] args) {
		// builder模式
		// Fluent API 各种方法 例子：项目非web启动 - .web(WebApplicationType.NONE)
		new SpringApplicationBuilder(DiveInSpringBootApplication.class)
//				.web(WebApplicationType.NONE)
				.run(args);
//		SpringApplication.run(DiveInSpringBootApplication.class, args);
	}

}
