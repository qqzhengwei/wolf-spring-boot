package com.wolf.sty.vo;

import java.util.List;

/**
 * 自定义分页标签 - 分页接口
 *
 * @author YongDi.Tang
 * @version 1.0
 * @date 2017/3/30
 */
public interface Paging<T> {

    Long getPageNo();

    Long getPageSize();

    Long getTotalPage();

    Long getTotalCount();

    List<T> getList();

    Long getLastPage();

    boolean isHasPreviousPage();

    boolean isHasNextPage();

    Long getPreviousPage();

    Long getNextPage();
}
