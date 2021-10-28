package com.baitu.cloud.service;

import com.baitu.cloud.client.RpcLogServiceClient;
import com.baitu.cloud.model.log.SysOperationLog;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步调用日志服务
 *
 * @author ruoyi
 */
@Service
@RequiredArgsConstructor
public class AsyncLogService {

    private final RpcLogServiceClient rpcLogServiceClient;

    /**
     * 保存系统日志记录
     */
    @Async
    public void saveSysLog(SysOperationLog log) {
        rpcLogServiceClient.saveLog(log);
    }

}
