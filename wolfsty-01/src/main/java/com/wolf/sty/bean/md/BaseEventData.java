package com.wolf.sty.bean.md;

import lombok.Data;

/**
 * Created by user on 2020/10/16.
 */
@Data
public class BaseEventData extends BaseConfigData{
    /**事件ID*/
    private String eventId;
    /**事件名称*/
    private String eventName;
    /**事件标签*/
    private String eventLable;
}
