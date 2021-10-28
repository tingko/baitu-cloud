package com.baitu.cloud.controller;

import com.baitu.cloud.domain.R;
import com.baitu.cloud.model.form.LoginForm;
import com.baitu.cloud.model.form.RegisterForm;
import com.baitu.cloud.service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:14
 */
@Api(tags = "鉴权接口")
@RestController
@RequiredArgsConstructor
public class TokenController {

    private final LoginService loginService;

    @ApiOperation("登录")
    @PostMapping("/login")
    public R<?> login(@RequestBody LoginForm loginForm) {
        return R.ok();
    }

    @ApiOperation("退出")
    @GetMapping("/logout")
    public R<?> logout() {
        return R.ok();
    }

    @ApiOperation("注册")
    @PostMapping("/register")
    public R<?> register(@RequestBody RegisterForm registerForm) {
        return R.ok();
    }

}
