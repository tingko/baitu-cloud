package com.baitu.cloud.rpc;

import com.baitu.cloud.model.entity.UserEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:42
 * 用户服务接口
 */
public interface RpcUserService {

    @GetMapping("/rpc/system/users/findByUsername")
    UserEntity findByUsername(@RequestParam String username);

}
