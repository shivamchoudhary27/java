package com.aiims.antenatalcare.portal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.dto.UserDto;
import com.aiims.antenatalcare.portal.entity.Admin;
import com.aiims.antenatalcare.portal.repository.AdminRepository;

@Service
public class CustomUserDetailsServiceImpl implements CustomUserDetailsService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Admin admin = null;
		Optional<Admin> optionalAdmin = adminRepository.findByUsername(username);
		if (optionalAdmin.isPresent()) {
			admin = optionalAdmin.get();

		}
		return admin;
	}

	@Override
	public UserDto getCurrentUser() {
		Object a = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		// userRepository.findById(null);
		return null;
	}

	@Override
	public UserDto getUser(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
