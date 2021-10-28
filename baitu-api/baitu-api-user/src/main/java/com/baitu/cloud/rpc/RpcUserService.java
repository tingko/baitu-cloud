package com.baitu.cloud.rpc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 11:02
 * 用户服务接口
 */
public interface RpcUserService {

    @GetMapping("/rpc/users/find/username")
    void findByUsername(@RequestParam String username);

}
