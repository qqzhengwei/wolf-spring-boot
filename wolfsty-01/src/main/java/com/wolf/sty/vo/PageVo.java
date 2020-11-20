package com.wolf.sty.vo;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.wolf.sty.util.UtilValidate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 分页VO
 *
 * @author Yong.Liang
 * @version 1.0
 * @date 2017年03月10日
 */
public class PageVo<T> implements Paging, Serializable {

    private static final long serialVersionUID = -45179336188314765L;

    /**
     * 当前页面
     */
    private Long pageNo = 0L;

    /**
     * 分页大小
     */
    private Long pageSize = 0L;

    /**
     * 总页数
     */
    private Long totalPage = 0L;

    /**
     * 总的记录数
     */
    private Long totalCount = 0L;

    /**
     * 分页列表
     */
    private List<T> list = new ArrayList<>();

    public PageVo() {
    }


    public PageVo(IPage page) {
        this.pageNo = page.getCurrent();
        this.pageSize = page.getSize();
        this.totalPage =  page.getPages();
        this.totalCount =  page.getTotal();
        this.list = page.getRecords();
    }



    @Override
    public Long getPageNo() {
        return pageNo;
    }

    @Override
    public Long getPageSize() {
        return pageSize;
    }

    @Override
    public Long getTotalPage() {
        return totalPage;
    }

    @Override
    public Long getTotalCount() {
        return totalCount;
    }

    @Override
    public List<T> getList() {
        return list;
    }

    @Override
    public Long getLastPage() {
        return this.totalPage;
    }

    @Override
    @JsonInclude
    public boolean isHasPreviousPage() {
        return pageNo > 1;
    }

    @Override
    @JsonInclude
    public boolean isHasNextPage() {
        return this.pageNo < this.totalPage;
    }

    @Override
    @JsonInclude
    public Long getPreviousPage() {
        return pageNo - 1;
    }

    @Override
    @JsonInclude
    public Long getNextPage() {
        return this.pageNo + 1;
    }

    public void setList(List list) {
        if (UtilValidate.isNotEmpty(list)) {
            this.list = list;
        }
    }
}

