package com.baitu.cloud.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.time.LocalDateTime;

/**
 * @author cj@baitutech.com
 * @since 2021.07.28 09:48
 * 公共字段填充
 */
public class FieldMetaObjectHandler implements MetaObjectHandler {

    /**
     * 创建时间
     */
    private static final String CREATE_TIME_FIELD = "createTime";

    /**
     * 更新时间
     */
    private static final String UPDATE_TIME_FIELD = "updateTime";

    /**
     * 新增操作时
     * 填充【创建时间】【更新时间】字段
     *
     * @param metaObject 元对象
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        this.setFieldValByName(CREATE_TIME_FIELD, now, metaObject);
        this.setFieldValByName(UPDATE_TIME_FIELD, now, metaObject);
    }

    /**
     * 更新操作时
     * 填充【更新时间】字段
     *
     * @param metaObject 元对象
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        LocalDateTime now = LocalDateTime.now();
        this.setFieldValByName(UPDATE_TIME_FIELD, now, metaObject);
    }

}
