package com.baitu.cloud.model.form;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:15
 * 登录表单模型
 */
@Data
@ApiModel("登录表单模型")
public class LoginForm {

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不可为空")
    private String username;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不可为空")
    private String password;

}
