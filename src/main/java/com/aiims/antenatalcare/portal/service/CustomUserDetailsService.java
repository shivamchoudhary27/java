package com.aiims.antenatalcare.portal.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.aiims.antenatalcare.portal.dto.UserDto;

public interface CustomUserDetailsService extends UserDetailsService {

	UserDto getCurrentUser();

	UserDto getUser(Long id);

}
