package com.GH3haitao.handle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.GH3haitao.exception.MyException;
import com.GH3haitao.module.Result;
import com.GH3haitao.utils.ResultUtil;


@ControllerAdvice
public class ExceptionHandle {
	private final static Logger logger = LoggerFactory
			.getLogger(ExceptionHandle.class);

	@ExceptionHandler(value = MyException.class)
	@ResponseBody
	// 因为返回给浏览器是json所以需要注解这个
	public Result handle(Exception e) {
		if (e instanceof MyException) {// 判断是否是自己的定义的异常(MyException待会会说明)
			MyException se = (MyException) e;
			return ResultUtil.error(se.getCode(), se.getMessage());
		}
		logger.error("【系统异常】{}", e);// 将异常记录日志当中
		return ResultUtil.error(-1, "未知异常");
	}
}