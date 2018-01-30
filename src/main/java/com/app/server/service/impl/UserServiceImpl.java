/**
 * Project Name:foriseholdings
 * File Name:UserServiceImpl.java
 * Package Name:com.app.server.service.impl
 * Date:2017年12月14日下午6:25:38
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/

package com.app.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.server.mapper.SysUserMapper;
import com.app.server.model.SysUser;
import com.app.server.model.SysUserExample;
import com.app.server.service.UserService;

/**
 * ClassName:UserServiceImpl <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年12月14日 下午6:25:38 <br/>
 * 
 * @author DELL
 * @version
 * @since JDK 1.6
 * @see
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private SysUserMapper userMapper;

	@Override
	public SysUser findByUsername(String username) {
		SysUserExample example = new SysUserExample();
		example.createCriteria().andUsernameEqualTo(username);
		return userMapper.selectOneByExample(example);
	}

	@Override
	public List<SysUser> findAll() {
		SysUserExample example = new SysUserExample();
		return userMapper.selectByExample(example);
	}

}
