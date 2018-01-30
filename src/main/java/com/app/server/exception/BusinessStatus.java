/**
 * Project Name:foriseholdings
 * File Name:Status.java
 * Package Name:com.app.server.common
 * Date:2017年12月21日上午9:55:59
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.exception;

/**
 * ClassName:Status <br/>
 * Function: API业务状态. <br/>
 * Date: 2017年12月21日 上午9:55:59 <br/>
 * 
 * @author hongda.yao@qq.com
 * @version
 * @since JDK 1.6
 * @see
 */
public enum BusinessStatus {
	
	FAILD(100, "Internal Request Error"), // 100固定,表示此次API请求失败
	
	OK(200, "OK"), // 200固定,表示此次API请求成功
	
	ERROR(300, "Internal Server Error"), // 300固定,表示此次API请求失败

	F400(400, "Internal Server Error"), // FAILED 400及以上表示业务逻辑上的异常,后续根据需要追加状态

	F500(500, "Internal Server Error"),// FAILED 500及以上表示服务资源异常（如数据库资源）,后续根据需要追加状态
	
	NoAuthority(600, "No Authority Error")// FAILED 600固定,表示无权限访问该接口
	
	;
	
	public static final int FAILD_CODE = 100;

	private int code;// 状态码
	private String msg;// 状态码描述

	private BusinessStatus(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return String.valueOf("{code:" + this.code + ",msg:\"" + this.msg + "\"}");
	}
	
}
