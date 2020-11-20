package com.wolf.sty.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wolf.sty.entity.SysParam;

/**
 * SysParam 表数据服务层接口
 */
public interface ISysParamService extends IService<SysParam> {
    /**
     * 根据code查询value
     *
     * @param code 系统参数code值
     * @return
     */
    String getValueByCode(String code);

    /**
     * 根据code设值
     * @param code
     * @param value
     */
    void setValueByCode(String code, String value);

    void getAndSetValue();

    void saveValue();
}