/**
 * Project Name:foriseholdings
 * File Name:WebConfiguration.java
 * Package Name:com.app.server.config
 * Date:2017年12月15日上午11:24:25
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.config;

import java.util.List;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.validation.MessageCodesResolver;
import org.springframework.validation.Validator;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.method.support.HandlerMethodReturnValueHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * ClassName:WebConfiguration <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月15日 上午11:24:25 <br/>
 * 
 * @author DELL
 * @version
 * @since JDK 1.6
 * @see
 */
@Configuration
public class WebConfiguration implements WebMvcConfigurer {

	@Override
	public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new LogInterceptor());
		
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addReturnValueHandlers(List<HandlerMethodReturnValueHandler> valueHandlers) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configurePathMatch(PathMatchConfigurer configurer) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extendHandlerExceptionResolvers(List<HandlerExceptionResolver> resolvers) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
		
	         
		
	}

	@Override
	public MessageCodesResolver getMessageCodesResolver() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Validator getValidator() {
		
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
