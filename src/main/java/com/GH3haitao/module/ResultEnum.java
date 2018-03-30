package com.GH3haitao.module;

public enum ResultEnum {
	UNKONW_ERROR(-1, "未知错误"), SUCCESS(0, "成功"), SERVEFAILURE(1,"获取系统服务信息失败");
	private Integer code;
	private String msg;

	ResultEnum(Integer code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public Integer getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

}
