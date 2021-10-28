package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:39
 * 用户组角色实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupRoleEntity extends BaseEntity<GroupRoleEntity> {

    private Long groupId;

    private Long roleId;

}
