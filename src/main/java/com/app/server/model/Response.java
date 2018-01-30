/**
 * Project Name:foriseholdings
 * File Name:Response.java
 * Package Name:com.app.server.common
 * Date:2017年12月21日上午10:11:33
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.model;

import java.io.Serializable;

import com.app.server.exception.BusinessStatus;

/**
 * ClassName:Response <br/>
 * Function: API返回数据的整体封装对象. <br/>
 * Date: 2017年12月21日 上午10:11:33 <br/>
 * 
 * @author hongda.yao@qq.com
 * @version
 * @since JDK 1.6
 * @see
 */
public class Response implements Serializable {
	private static final long serialVersionUID = 1L;

	public static Response build(BusinessStatus status, Object object) {
		Response response = new Response(status, object);
		return response;
	}
	
	public static Response build(int code, String msg, Object object) {
		Response response = new Response(code, msg, object);
		return response;
	}

	public Response() {
		super();
	}

	public Response(BusinessStatus status, Object object) {
		super();
		this.status = new Status(status);
		this.object = object;
	}
	
	public Response(int code, String msg, Object object) {
		super();
		this.status = new Status(code, msg);
		this.object = object;
	}

	private Object object;// API返回的数据部分
	private Status status;// API返回的状态信息部分

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

}
