package com.wolf.sty.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wolf.sty.common.vo.JSONResult;
import com.wolf.sty.entity.SysParam;
import com.wolf.sty.service.ISysParamService;
import com.wolf.sty.vo.PageVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by user on 2020/9/22.
 */
@RestController
public class SysParamController {

    @Autowired
    private ISysParamService sysParamService;

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
    public JSONResult getList() {
        return new JSONResult(sysParamService.list());
    }

    @RequestMapping(value = "/getByCode", method = RequestMethod.GET)
    public JSONResult getByCode() {
        sysParamService.getAndSetValue();
        return new JSONResult(sysParamService.getValueByCode("TL_PAY_INTERMEDIATE_BUTT_CODE"));
    }

    @RequestMapping(value = "/getPage", method = RequestMethod.GET)
    public JSONResult getPage() {
        Page<SysParam> page = new Page<SysParam>(1,10);
        IPage page1 = sysParamService.page(page);
        return new JSONResult(new PageVo(page1));
    }

    @RequestMapping(value = "/initData", method = RequestMethod.GET)
    public JSONResult initData() {
        sysParamService.saveValue();
        return new JSONResult("数据处理成功");
    }
}
