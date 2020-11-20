package com.wolf.sty.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wolf.sty.annotation.CustomCache;
import com.wolf.sty.entity.SysParam;
import com.wolf.sty.enums.YNEnum;
import com.wolf.sty.exception.BusinessAsserts;
import com.wolf.sty.exception.Exceptions;
import com.wolf.sty.mapper.SysParamMapper;
import com.wolf.sty.service.ISysParamService;
import com.wolf.sty.util.DateUtils;
import com.wolf.sty.util.JSONHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * SysParam 表数据服务层接口实现类
 */
@Service
public class SysParamServiceImpl extends ServiceImpl<SysParamMapper, SysParam> implements ISysParamService {

    private static final Logger logger = LoggerFactory.getLogger(SysParamServiceImpl.class);

    /**
     * 根据code查询value
     *
     * @param code 系统参数code值
     * @return
     */
    @Override
    //@Cacheable(value = "wolf:sty:catche",key = "#code")
    @CustomCache(key="#code",pre="wolf:sty:catche:")
    //@CacheEvict(value = Constants.ROLE_MENU_CACHE_KEY, key = "#role.code")删除
    public String getValueByCode(String code) {
        /**1.校验*/
        BusinessAsserts.notBlank(code, Exceptions.System.SYSTEM_PARAM_ERROR);

        /**2.查询*/
        SysParam sysParam = this.getOne(new QueryWrapper<SysParam>().eq("code", code).eq("is_valid", YNEnum.YES.code));
        BusinessAsserts.notNull(sysParam, Exceptions.System.SYSTEM_ERROR);
        return "null".equals(sysParam.getValue()) ? "" : sysParam.getValue();
    }

    /**
     * 根据code设值
     *
     * @param code
     * @param value
     */
    @Override
    public void setValueByCode(String code, String value) {
        //校验
        BusinessAsserts.notBlank(code, Exceptions.System.SYSTEM_PARAM_ERROR);
        BusinessAsserts.notBlank(value, Exceptions.System.SYSTEM_PARAM_ERROR);

        //查询

        SysParam sysParam = this.getOne(Wrappers.<SysParam>query().eq("code", code).eq("is_valid", YNEnum.YES.code));
        BusinessAsserts.notNull(sysParam, Exceptions.System.SYSTEM_ERROR);

        //保存
        SysParam updateParam = new SysParam();
        updateParam.setId(sysParam.getId());
        updateParam.setValue(value);
        updateParam.setUpdateTime(DateUtils.getDate());
        boolean flag = this.updateById(updateParam);
        if (!flag) {
            logger.error("setValueByCode fail,code:{},value:{},updateParam:{}", code, value, JSONHelper.toJSONString(updateParam));
        }
        BusinessAsserts.isTrue(flag, Exceptions.System.SAVE_FAIL);
    }

    @Override
    @Transactional
    public void getAndSetValue() {
        SysParam sysParam = this.getOne(new QueryWrapper<SysParam>().eq("code","TL_PAY_INTERMEDIATE_BUTT_CODE"));
        BusinessAsserts.notNull(sysParam, Exceptions.System.SYSTEM_ERROR,"CODE码不存在");
        sysParam.setDescription("被我修改了");
        super.saveOrUpdate(sysParam);
    }

    @Override
    @Transactional
    public void saveValue() {
        SysParam sysParam = new SysParam();
        sysParam.setCode("K1");
        sysParam.setValue("kkkkk");
        sysParam.setName("吃票子不");
        sysParam.setCreateBy("system");
        sysParam.setCreateTime(new Date());
        sysParam.setUpdateBy("system");
        sysParam.setUpdateTime(new Date());
        this.save(sysParam);
        SysParam sysParam2 = new SysParam();
        sysParam2.setCode("K1");
        sysParam2.setValue("kkkkk");
        sysParam2.setName("吃票子不2");
        sysParam2.setCreateBy("system");
        sysParam2.setCreateTime(new Date());
        sysParam2.setUpdateBy("system");
        sysParam2.setUpdateTime(new Date());
        this.save(sysParam2);
        //int i = 1/0;//抛异常了，看看异常处理情况
    }
}