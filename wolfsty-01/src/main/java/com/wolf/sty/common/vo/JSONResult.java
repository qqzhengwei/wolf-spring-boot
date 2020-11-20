package com.wolf.sty.common.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口返回数据封装
 * 
 * @author Nian.Li
 * @version 1.0
 * @date 2017年2月24日
 */
@JsonInclude(Include.NON_NULL)
public class JSONResult<T> {

	public static final int CODE_SUCCESS = 0;

	/**
	 * 返回码
	 */
	private Integer code = CODE_SUCCESS;

	/**
	 * 返回消息说明
	 */
	private String msg;

	/**
	 * 数据体
	 */
	private T data;

	public JSONResult() {
	}

	public JSONResult(T data) {
		this(CODE_SUCCESS, null, data);
	}

	public JSONResult(Integer code, String msg) {
		this(code, msg, null);
	}

	public JSONResult(String key, Object value) {
		this.code = 0;
		Map<String, Object> m = new HashMap<String, Object>(1);
		m.put(key, value);
		data = (T)m;
	}

	public JSONResult(Integer code, String msg, T data) {
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
