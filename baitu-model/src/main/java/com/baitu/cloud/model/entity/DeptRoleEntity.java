package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:39
 * 部门角色实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class DeptRoleEntity extends BaseEntity<DeptRoleEntity> {

    private Long deptId;

    private Long roleId;

}
