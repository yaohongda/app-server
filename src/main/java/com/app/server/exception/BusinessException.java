/**
 * Project Name:foriseholdings
 * File Name:BusinessException.java
 * Package Name:com.app.server.common
 * Date:2017年12月21日下午3:28:21
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.exception;

/**
 * ClassName:BusinessException <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月21日 下午3:28:21 <br/>
 * 
 * @author hongda.yao@qq.com
 * @version
 * @since JDK 1.6
 * @see
 */
public class BusinessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BusinessException(int code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	private int code;// 状态码
	private String msg;// 状态码描述

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
	public String getMessage() {
		return "BusinessException:{code:" + code + ",msg:" + msg + "}";
	}

}
