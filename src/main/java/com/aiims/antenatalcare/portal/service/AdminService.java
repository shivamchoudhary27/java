package com.aiims.antenatalcare.portal.service;

import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.dto.UserDto;

@Service
public interface AdminService {

	UserDto getUserProfile();

	UserDto updateUserProfile(UserDto dto);

}
