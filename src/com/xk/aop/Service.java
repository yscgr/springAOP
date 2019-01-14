package com.xk.aop;

public class Service implements ServiceInterface {
	@Override
	public void insertMySQLDb() {
		System.out.println("执行业务逻辑，信息录入MySQL数据库中。");
	}
}
