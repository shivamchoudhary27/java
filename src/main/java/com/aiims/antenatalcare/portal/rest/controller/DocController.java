package com.aiims.antenatalcare.portal.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.service.DoctorsService;

@RestController
@RequestMapping("/api/v2/doctor")
public class DocController {

	Logger logger = LoggerFactory.getLogger(DocController.class);

	@Autowired
	private DoctorsService doctorsService;

	@GetMapping("/{id}")
	public ResponseEntity<ResponseDto> getDoctorDetail(@PathVariable("id") Long id) {
		logger.info("Getting doctor details with id:"+ id);
		return new ResponseEntity<>(doctorsService.getDoctorDetails(id), HttpStatus.OK);
	}

}
