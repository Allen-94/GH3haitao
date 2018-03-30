package com.GH3haitao.utils;

import com.GH3haitao.module.Result;

public class ResultUtil {
	public static Result success(Object ob) {
		Result res = new Result();
		res.setCode(0);
		res.setMsg("成功");
		res.setData(ob);
		return res;
	}

	public static Result success() {// 没有返回结果的时候成功
		return success(null);
	}

	public static Result error(Integer code, String msg) {
		Result res = new Result();
		res.setCode(code);
		res.setMsg(msg);
		return res;
	}
}