package com.baitu.cloud;


import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.util.Date;

/**
 * @author cj@baitutech.com
 * @since 2021.07.22 10:16
 * 基础业务模型
 */
@ApiModel("基础业务模型")
@Data
@EqualsAndHashCode(callSuper = true)
public class BaseEntity<T extends Model<?>> extends Model<T> implements Serializable {

    @ApiModelProperty("主键")
    @TableId(type = IdType.AUTO)
    private Long id;

    @ApiModelProperty("创建时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty("更新时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @TableField(value = "update_time", fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @ApiModelProperty(hidden = true)
    @TableLogic
    @TableField("deleted")
    private Boolean deleted;

}
