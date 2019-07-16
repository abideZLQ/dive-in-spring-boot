package com.zlq.web.config;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * Spring Web MVC 配置（类）
 *
 * @author zlq
 * @since 2019/6/25
 */
@Configuration
//@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public ViewResolver myViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setSuffix(".jsp");
        // ThymeleafViewResolver Ordered.LOWEST_PRECEDENCE - 5
        viewResolver.setOrder(Ordered.LOWEST_PRECEDENCE - 10);
        // 优先级高于 ThymeleafViewResolver
        // 配置 ViewResolver 的 Content-Type(媒体类型)
        viewResolver.setContentType("text/xml;charset=UTF-8");
        return viewResolver;
    }

    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        // 是否偏好参数/是否偏好加上文件扩展名
        configurer.favorParameter(true).favorPathExtension(true);
    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 注册一个拦截器,使用匿名内部类
        registry.addInterceptor(new HandlerInterceptor() {
            @Override
            public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
                System.out.println("拦截中...");
                return true;
            }
        });
    }

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
        return (factory) -> {
            factory.addContextCustomizers((context) -> {
                String relativePath = "springboot-view/src/main/webapp";
                // 相对于 user.dir = E:\001-springBootSpace\001.code\003.actualDemo\dive-in-spring-boot
                File docBaseFile = new File(relativePath); // 相对路径相对于绝对路径的绝对路径
                if(docBaseFile.exists()) { // 路径是否存在
                    // 解决 Maven 多模块 JSP 无法读取的问题
                    context.setDocBase(docBaseFile.getAbsolutePath());
                }
            });
        };
    }
}
