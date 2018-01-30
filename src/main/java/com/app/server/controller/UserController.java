package com.app.server.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.json.JSONUtils;
import com.app.server.exception.BusinessStatus;
import com.app.server.model.Response;
import com.app.server.model.SysUser;
import com.app.server.service.UserService;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class UserController {
	private Logger logger = LoggerFactory.getLogger("mongoAppender");
	@Autowired
	private UserService userService; // Service which will do all data retrieval/manipulation work

	@PreAuthorize("hasRole('ADMIN')")
	@RequestMapping(value = "/userList/", method = RequestMethod.GET)
	public Response listAllUsers() {
		List<SysUser> users = userService.findAll();

		if (users.isEmpty()) {
			return Response.build(BusinessStatus.F400, null);
		}
		logger.info(JSONObject.fromObject(users.get(0)).toString());
//		logger.info(JSONUtils.toJSONString(users).toString());
		return Response.build(BusinessStatus.OK, users);
	}

}