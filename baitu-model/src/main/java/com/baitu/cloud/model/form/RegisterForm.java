package com.baitu.cloud.model.form;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:56
 * TODO remark
 */
@ApiModel("注册表单模型")
@EqualsAndHashCode(callSuper = true)
@Data
public class RegisterForm extends LoginForm {
}
