package com.app.server.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.server.mapper.SysRoleMapper;
import com.app.server.model.SysRole;
import com.app.server.service.UserRoleService;

@Service
public class UserRoleServiceImpl implements UserRoleService {

	@Autowired
	private SysRoleMapper roleMapper;

	@Override
	public List<SysRole> findByUserId(Integer uid) {

		return roleMapper.selectByUserId(uid);
	}

}
