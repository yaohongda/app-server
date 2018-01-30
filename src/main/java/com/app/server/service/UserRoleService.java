/**
 * Project Name:foriseholdings
 * File Name:UserRoleService.java
 * Package Name:com.app.server.service.impl
 * Date:2017年12月20日上午10:43:53
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.service;

import java.util.List;

import com.app.server.model.SysRole;

public interface UserRoleService {
	List<SysRole> findByUserId(Integer uid);
}

