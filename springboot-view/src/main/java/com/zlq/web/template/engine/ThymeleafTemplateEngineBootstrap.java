package com.zlq.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.SpringTemplateEngine;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Thymeleaf 模板引擎引导类
 *
 * @author zlq
 * @since 2019/7/5
 */
public class ThymeleafTemplateEngineBootstrap {

    public static void main(String[] args) throws IOException {
        // 构建引擎
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        // 创建渲染上下文
        Context context = new Context();
        context.setVariable("message", "Hello,World");

        // 读取内容从 classpath:/templates/thymeleaf/hello-world.html
        // ResourceLoader
        ResourceLoader resourceLoader = new DefaultResourceLoader();
        // 通过 classpath:/templates/thymeleaf/hello-world.html 获取 Resource
        Resource resource = resourceLoader.getResource("classpath:/templates/thymeleaf/hello-world.html");
        File templateFile = resource.getFile();
        // 文件流
        FileInputStream inputStream = new FileInputStream(templateFile);//读
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();//写
        // Copy
        IOUtils.copy(inputStream,outputStream);

        inputStream.close();
        // 模板的内容
        String content = outputStream.toString("UTF-8");//UTF-8是html的编码
        // 渲染（处理）结果
        String result = templateEngine.process(content,context);
        // 输出渲染（处理）结果
        System.out.println(result);

    }

}
