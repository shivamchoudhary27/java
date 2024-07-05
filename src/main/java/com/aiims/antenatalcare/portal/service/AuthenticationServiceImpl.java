package com.aiims.antenatalcare.portal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.dto.SignInReqDto;
import com.aiims.antenatalcare.portal.repository.AdminRepository;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private AdminRepository adminRepository;

	@Autowired
	private JwtService jwtService;

	@Override
	public ResponseDto signin(SignInReqDto request) {
		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));

		var user = adminRepository.findByUsername(request.getUsername())
				.orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
		var jwt = jwtService.generateToken(user);
		return new ResponseDto(jwt, "Success", HttpStatus.OK);

	}

}
