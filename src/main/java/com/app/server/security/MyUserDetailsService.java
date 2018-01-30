package com.app.server.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.app.server.model.SysRole;
import com.app.server.model.SysUser;
import com.app.server.service.UserRoleService;
import com.app.server.service.UserService;

public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRoleService userRoleService;

	/**
	 * 根据用户名获取登录用户信息
	 * 
	 * @param username
	 * @return
	 * @throws UsernameNotFoundException
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser user = userService.findByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("用户名：" + username + "不存在！");
		}
		Collection<SimpleGrantedAuthority> collection = new HashSet<SimpleGrantedAuthority>();
		List<SysRole> roles = userRoleService.findByUserId(user.getUid());
		for (SysRole role : roles) {
			collection.add(new SimpleGrantedAuthority(role.getRole()));
		}

		return new org.springframework.security.core.userdetails.User(username, user.getPassword(), collection);
	}
}
