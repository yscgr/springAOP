package com.xk.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

import junit.framework.Test;

public class MyMethodBeforeAdvice implements MethodBeforeAdvice {
	private static Logger logger = Logger.getLogger(Test.class);

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("在前置通知中，已写入日志信息");
		logger.debug("This is debug message.");
	}
}
