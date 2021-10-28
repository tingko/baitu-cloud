package com.baitu.cloud.client;

import com.baitu.cloud.rpc.RpcLogService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 12:05
 * 日志服务接口调用
 */
@FeignClient(name = "baitu-system-server", contextId = "RpcLogServiceClient")
public interface RpcLogServiceClient extends RpcLogService {
}
