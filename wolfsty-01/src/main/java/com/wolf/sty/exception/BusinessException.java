package com.wolf.sty.exception;

import org.springframework.util.StringUtils;

/**
 * 业务异常,所有与具体业务有关的异常统一抛本类或其子类,使用ExceptionType来确定异常代码,提示信息
 * @author Nian.Li
 * @version v1.0
 * @date 2017年2月24日
 */
public class BusinessException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9010901992938636148L;

	/**
	 * 异常状态码
	 */
	private Integer code;
	
	/**
	 * 异常描述
	 */
	private String description;
	
	/**
	 * 业务异常基础接口
	 */
	private ExceptionType type;

	public BusinessException() {
		super();
	}

	public BusinessException(Exception e) {
		super(e);
	}

	public BusinessException(ExceptionType type) {
		this(type.getCode(), null, type);
	}

	public BusinessException(ExceptionType type, Throwable cause) {
		this(type.getCode(), type.getDescription(), type, cause);
	}

	public BusinessException(ExceptionType type, String desc, Throwable cause) {
		this(type.getCode(), desc, type, cause);
	}

	public BusinessException(ExceptionType type, String desc) {
		this(type.getCode(), desc, type);
	}

	private BusinessException(Integer code, String description, ExceptionType type, Throwable cause) {
		super(description, cause);
		this.code = code;
		this.description = description;
		this.type = type;
	}

	private BusinessException(Integer code, String description, ExceptionType type) {
		super(description);
		this.code = code;
		this.description = description;
		this.type = type;
	}

	public String getMessage() {
		String msg = "";
		if(this.type == null){
			return this.getCause().getMessage();
		}
		if (StringUtils.hasText(this.description)) {
			msg += this.description;
		}
		if (StringUtils.hasText(this.type.getDescription())) {
			if (StringUtils.hasText(msg)) {
				msg += ":";
			}
			msg += this.type.getDescription();
		}
		return msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getDescription() {
		return description;
	}

	public ExceptionType getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusinessException other = (BusinessException) obj;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

}
