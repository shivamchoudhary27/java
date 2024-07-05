package com.aiims.antenatalcare.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.assembler.UserAssembler;
import com.aiims.antenatalcare.portal.dto.UserDto;
import com.aiims.antenatalcare.portal.entity.Admin;
import com.aiims.antenatalcare.portal.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private UserAssembler userAssembler;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public UserDto getUserProfile() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		Admin admin = adminRepository.findByUsername(authentication.getName()).orElseThrow();

		return userAssembler.toDto(admin);
	}

	@Override
	public UserDto updateUserProfile(UserDto dto) {

		Admin admin = adminRepository.getReferenceById(dto.getAdminid());

		if (null != dto.getPassword() && !dto.getPassword().isEmpty() && !dto.getPassword().isBlank()) {
			admin.setPassword(passwordEncoder.encode(dto.getPassword()));
		}
		admin.setEmail(dto.getEmail());
		admin.setName(dto.getName());
		admin.setUsername(dto.getUsername());

		try {
			adminRepository.save(admin);

		} catch (Exception e) {
			// TODO: handle exception
		}

		return userAssembler.toDto(admin);
	}

}
