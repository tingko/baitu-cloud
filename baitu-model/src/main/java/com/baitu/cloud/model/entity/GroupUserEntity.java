package com.baitu.cloud.model.entity;

import com.baitu.cloud.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author cj@baitutech.com
 * @since 2021.10.28 16:37
 * 用户组用户实体类
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GroupUserEntity extends BaseEntity<GroupUserEntity> {

    private Long groupId;

    private Long userId;

}
