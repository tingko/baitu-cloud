package com.baitu.cloud.client;

import com.baitu.cloud.rpc.RpcUserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:47
 * TODO remark
 */
@FeignClient(name = "baitu-system", contextId = "UserServiceClient")
public interface UserServiceClient extends RpcUserService {
}
