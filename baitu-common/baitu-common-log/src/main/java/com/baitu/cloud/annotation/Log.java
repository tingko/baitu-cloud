package com.baitu.cloud.annotation;

import com.baitu.cloud.enums.BusinessType;

import java.lang.annotation.*;

/**
 * @author cj@baitutech.com
 * @since 2021.07.22 13:25
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Log {
    /**
     * 模块
     */
    String title() default "";

    /**
     * 功能
     */
    BusinessType businessType() default BusinessType.OTHER;

    /**
     * 是否保存请求的参数
     */
    boolean isSaveRequestData() default true;

}