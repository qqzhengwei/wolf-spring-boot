package com.wolf.sty.entity.base;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 平台实体基类
 *
 * @author YongDi.Tang
 * @version 1.0
 * @date 2018-06-11
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BaseAuditEntity implements Serializable {

    /**
     * 主键
     */
    @TableId(type = IdType.UUID)
    private String id;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 是否有效，Y表示有效，N表示无效
     */
    @TableLogic
    private String isValid;

}
