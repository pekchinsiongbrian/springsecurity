package com.dxc.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.dxc.model.User;
import com.dxc.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);
}
