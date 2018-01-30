/**
 * Project Name:foriseholdings
 * File Name:Status.java
 * Package Name:com.app.server.common
 * Date:2017年12月21日下午3:39:52
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.model;

import java.io.Serializable;

import com.app.server.exception.BusinessStatus;

/**
 * ClassName:Status <br/>
 * Function: API返回的状态信息. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月21日 下午3:39:52 <br/>
 * 
 * @author hongda.yao@qq.com
 * @version
 * @since JDK 1.6
 * @see
 */
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Status(int code, String msg){
		super();
		this.code = code;
		this.msg = msg;
	}
	
	public Status(BusinessStatus status) {
		super();
		this.code = status.getCode();
		this.msg = status.getMsg();
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
}
