package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:37
 * 用户角色关联实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class UserRoleEntity extends BaseEntity<UserRoleEntity> {

    private Long userId;

    private Long roleId;

}
