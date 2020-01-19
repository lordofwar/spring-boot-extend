package com.example.mybatis.annodation;

import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.annotation.Propagation;

import java.lang.annotation.*;

/**
 * @version 1.0
 * @ClassName TranscationalManagement
 * @Description 事务管理器
 * @Author mingj
 * @Date 2019/10/27 12:56
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface TranscationalManagement {

    String[] value() default {};
}
