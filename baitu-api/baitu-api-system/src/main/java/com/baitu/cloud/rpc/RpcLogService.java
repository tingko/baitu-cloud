package com.baitu.cloud.rpc;

import com.baitu.cloud.model.log.SysOperationLog;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 12:04
 * 日志服务接口
 */
public interface RpcLogService {

    @PostMapping("/rpc/logs")
    void saveLog(SysOperationLog log);

}
