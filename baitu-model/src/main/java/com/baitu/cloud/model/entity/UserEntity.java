package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:19
 * 用户实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserEntity extends BaseEntity<UserEntity> {

    private String username;

}
