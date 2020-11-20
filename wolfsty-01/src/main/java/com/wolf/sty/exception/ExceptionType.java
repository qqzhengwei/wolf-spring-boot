package com.wolf.sty.exception;

/**
 * 业务异常基础接口
 * @author Nian.Li
 * @version v1.0
 * @date 2017年2月24日
 */
public interface ExceptionType {
	/**
	 * 异常代码
	 * @return
	 */
	int getCode();

	/**
	 * 异常描述信息
	 * @return
	 */
	String getDescription();
}
