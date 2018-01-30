/**
 * Project Name:foriseholdings
 * File Name:GenericErrorController.java
 * Package Name:com.app.server.controller
 * Date:2017年12月19日上午10:52:40
 * Copyright (c) 2017, hongda.yao@qq.com All Rights Reserved.
 *
*/

package com.app.server.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName:GenericErrorController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月19日 上午10:52:40 <br/>
 * 
 * @author DELL
 * @version
 * @since JDK 1.6
 * @see
 */
@Controller
public class GenericErrorController implements ErrorController {
	private static final String ERROR_PATH = "/error";

	@RequestMapping(ERROR_PATH)
	@ResponseBody
	public String error() {
		return "{code:500,msg:\"服务器内部错误\"}";
	}

	@Override
	public String getErrorPath() {
		return ERROR_PATH;
	}
}
