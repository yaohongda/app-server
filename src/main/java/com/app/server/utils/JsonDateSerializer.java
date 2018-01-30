/**
 * Project Name:foriseholdings
 * File Name:JsonDateSerializer.java
 * Package Name:com.app.server.config
 * Date:2017年12月15日上午9:54:02
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.utils;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.jackson.JsonComponent;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

/**
 * ClassName:JsonDateSerializer <br/>
 * Function: 自定义jackson日期格式. <br/>
 * Date: 2017年12月15日 上午9:54:02 <br/>
 * 
 * @author DELL
 * @version
 * @since JDK 1.8
 * @see
 */
@JsonComponent
public class JsonDateSerializer extends JsonSerializer<Date> {
	private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	@Override
	public void serialize(Date date, JsonGenerator gen, SerializerProvider provider)
			throws IOException, JsonProcessingException {
		
		String formattedDate = dateFormat.format(date);
		gen.writeString(formattedDate);
	}
}
