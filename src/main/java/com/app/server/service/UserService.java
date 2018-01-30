/**
 * Project Name:foriseholdings
 * File Name:UserService.java
 * Package Name:com.app.server.service
 * Date:2017年12月14日下午6:24:24
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.service;

import java.util.List;

import com.app.server.model.SysUser;

public interface UserService {

    SysUser findByUsername(String username);

	List<SysUser> findAll();
}

