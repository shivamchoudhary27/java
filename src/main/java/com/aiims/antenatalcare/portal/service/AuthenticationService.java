package com.aiims.antenatalcare.portal.service;

import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.dto.SignInReqDto;

public interface AuthenticationService {

	ResponseDto signin(SignInReqDto request);
}
