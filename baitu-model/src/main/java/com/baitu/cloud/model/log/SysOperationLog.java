package com.baitu.cloud.model.log;

import com.baitu.cloud.BaseEntity;
import lombok.Data;

/**
 * @author cj@baitutech.com
 * @since 2021.09.27 11:55
 * 系统操作日志实体类
 */
@Data
public class SysOperationLog extends BaseEntity<SysOperationLog> {

    /**
     * 操作模块
     */
    private String title;

    /**
     * 业务类型（0其它 1新增 2修改 3删除）
     */
    private Integer businessType;

    /**
     * 业务类型数组
     */
    private Integer[] businessTypes;

    /**
     * 请求方法
     */
    private String method;

    /**
     * 请求方式
     */
    private String requestMethod;

    /**
     * 操作人员
     */
    private String operatorName;

    /**
     * URL
     */
    private String url;

    /**
     * 操作地址
     */
    private String ip;

    /**
     * 请求参数
     */
    private String parameters;

    /**
     * 返回参数
     */
    private String jsonResult;

    /**
     * 操作状态
     */
    private Boolean success;

    /**
     * 错误消息
     */
    private String errorMessage;

}
