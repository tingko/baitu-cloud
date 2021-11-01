package com.baitu.cloud.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author cj@baitutech.com
 * @since 2021.07.22 10:02
 * Swagger 属性
 */
@Data
@Component
@ConfigurationProperties(prefix = "swagger")
public class SwaggerProperties {

    /**
     * 是否启用
     */
    private Boolean enabled;

    /**
     * 扫描基包
     */
    private String basePackage;

    /**
     * 标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 版本
     */
    private String version;

    /**
     * 作者
     */
    private String author;

    /**
     * 官网
     */
    private String url;

    /**
     * 邮箱
     */
    private String email;

}
