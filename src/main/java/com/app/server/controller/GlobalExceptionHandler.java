/**
 * Project Name:foriseholdings
 * File Name:GlobalExceptionHandler.java
 * Package Name:com.app.server.controller
 * Date:2017年12月19日上午10:48:13
 * Copyright (c) 2017, hongda.yao@qq.com All Rights Reserved.
 *
*/

package com.app.server.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.app.server.exception.BusinessException;

/**
 * ClassName:GlobalExceptionHandler <br/>
 * Function: 统一异常处理. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月19日 上午10:48:13 <br/>
 * 
 * @author DELL
 * @version
 * @since JDK 1.6
 * @see
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

	private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

	@ExceptionHandler(DataAccessException.class)
	public String handleDataAccessException(HttpServletRequest request, DataAccessException ex) {
		logger.info("DataAccessException Occurred:: URL=" + request.getRequestURL());
		return "db_error";
	}

	@ExceptionHandler(ServletRequestBindingException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String servletRequestBindingException(ServletRequestBindingException e) {
		logger.error("ServletRequestBindingException occurred: " + e.getMessage());
		return "validation_error:"+e.getMessage();
	}
	@ExceptionHandler(BusinessException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public String businessException(BusinessException e) {
		logger.error("BusinessException occurred: " + e.getMessage());
		return "validation_error:"+e.getMessage();
	}


}
