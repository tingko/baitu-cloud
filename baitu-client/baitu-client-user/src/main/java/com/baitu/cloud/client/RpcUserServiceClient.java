package com.baitu.cloud.client;

import com.baitu.cloud.rpc.RpcUserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 11:04
 * 用户服务接口调用
 */
@FeignClient(name = "baitu-user-server", contextId = "RpcUserServiceClient")
public interface RpcUserServiceClient extends RpcUserService {


}
