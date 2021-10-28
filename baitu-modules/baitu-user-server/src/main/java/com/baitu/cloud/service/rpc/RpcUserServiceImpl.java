package com.baitu.cloud.service.rpc;

import com.baitu.cloud.rpc.RpcUserService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 11:05
 * 用户服务接口实现类
 */
@RestController
public class RpcUserServiceImpl implements RpcUserService {

    @Override
    public void findByUsername(String username) {
    }

}
