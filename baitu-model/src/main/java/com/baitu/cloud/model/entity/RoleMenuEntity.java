package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:36
 * 角色菜单关联实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class RoleMenuEntity extends BaseEntity<RoleMenuEntity> {

    private Long roleId;

    private Long menuId;

}
