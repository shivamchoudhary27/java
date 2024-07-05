package com.aiims.antenatalcare.portal.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.dto.SignInReqDto;
import com.aiims.antenatalcare.portal.service.AuthenticationService;

@RestController
@RequestMapping("/api/v2/auth")
public class AuthController {

	Logger logger = LoggerFactory.getLogger(AuthController.class);

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/signin")
	public ResponseEntity<ResponseDto> signup(@RequestBody SignInReqDto request) {
		logger.info("Getting signin request");
		return new ResponseEntity<>(authenticationService.signin(request), HttpStatus.OK);

	}

	@GetMapping("/user/me")
	public ResponseEntity<ResponseDto> getMeUser() {
		logger.info("Getting me request");
		return ResponseEntity.ok(new ResponseDto("aaaa", HttpStatus.OK));
	}

}
