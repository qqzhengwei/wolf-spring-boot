package com.wolf.sty.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wolf.sty.entity.base.BaseAuditEntity;
import lombok.Data;

import java.io.Serializable;

/**
 * 系统公共配置表
 1、平台收取佣金百分比  默认commission_percent
 *
 * @version V1.0
 * @auther Wei.Zheng
 * @date 2017年02月27日
 */
@Data
@TableName(value = "sp_sys_param")
public class SysParam extends BaseAuditEntity implements Serializable {

    @TableField(exist = false)
    private static final long serialVersionUID = 8640339697796002220L;

	/** 参数名称 */
	private String name;

	/** 参数编码 */
	private String code;

	/** 参数值 */
	private String value;

	/** 参数备注、说明 */
	private String description;

	/** 排序编号 */
	@TableField(value = "sort_index")
	private Integer sortIndex;

}
