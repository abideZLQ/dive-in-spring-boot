package com.zlq.diveinspringboot.annotation;


import org.springframework.stereotype.Repository;
import java.lang.annotation.*;

/**
 * 一级 {@link Repository @Repository}
 * 自定义模式注解
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
    // 签名要保持一致
    String value() default "";
}
