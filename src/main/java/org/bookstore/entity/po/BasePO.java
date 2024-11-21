package org.bookstore.entity.po;


import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public abstract class BasePO {

    /**
     * 自增ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 创建人
     */
    @TableField(fill = FieldFill.INSERT)
    Integer creator;

    /**
     * 更新人
     */
    @TableField(fill = FieldFill.UPDATE)
    Integer updater;

    /**
     * 创建时间
     */
    Date createTime;

    /**
     * 最近更新时间
     */
    Date updateTime;

    /**
     * 是否删除：0-否，1-是
     */
    @TableLogic
    Boolean isDelete;

    /**
     * 逻辑删除版本信息
     */
    Integer delVersion;

}
