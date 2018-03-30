package com.GH3haitao.exception;

import com.GH3haitao.module.ResultEnum;

public class MyException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8975376186975675071L;
	private Integer code;

	public MyException(ResultEnum re) {
		super(re.getMsg());
		this.code = re.getCode();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}
}