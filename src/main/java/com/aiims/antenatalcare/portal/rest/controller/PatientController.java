package com.aiims.antenatalcare.portal.rest.controller;

import java.util.List;

import com.aiims.antenatalcare.portal.dto.*;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.aiims.antenatalcare.portal.dto.PastHistoryDto;
import com.aiims.antenatalcare.portal.dto.PatientDto;
import com.aiims.antenatalcare.portal.dto.RequestDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;

import com.aiims.antenatalcare.portal.rest.service.PatientService;

@RestController
@CrossOrigin
@RequestMapping("/api/v2/patient")
public class PatientController {

	@Autowired
	private PatientService patientService;

	Logger logger = LoggerFactory.getLogger(PatientController.class);

	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createPatient(@RequestBody PatientDto requestDto) {
		logger.info("Creating patient ");

		return new ResponseEntity<>(patientService.createPatient(requestDto), HttpStatus.CREATED);

	}


	@PostMapping("/other/create")
	public ResponseEntity<ResponseDto> updatePatientOtherInfo(@RequestBody PatientDto requestDto) {
		logger.info("Creating patient other info ");

		return new ResponseEntity<>(patientService.updatePatientOtherInfo(requestDto), HttpStatus.CREATED);

	}


	@PostMapping("/pasthistory/create")
	public ResponseEntity<ResponseDto> createPatientPastHistory(@RequestBody PastHistoryDto requestDto) {
		logger.info("Creating patient past history");

		return new ResponseEntity<>(patientService.createPatientPastHistory(requestDto), HttpStatus.CREATED);

	}

	@PostMapping("/update/{id}")
	public PatientDto updatePatient(@PathVariable("id") long patientId, @RequestBody PatientDto requestDto) {
		logger.info("Updating patient");
		PatientDto savedRequestDto =null;// patientService.updatePatient(patientId, requestDto);
		return null;// savedRequestDto;

	}
	@PostMapping("/investigation/create")
	public ResponseEntity<ResponseDto> createPatientInvestigation(@RequestBody InvestigationsDto requestDto) {
		logger.info("Creating patient investigation");

		return new ResponseEntity<>(patientService.createPatientInvestigation(requestDto), HttpStatus.CREATED);


	}

	@GetMapping("/{id}")
	public ResponseEntity<ResponseDto> getPatient(@PathVariable("id") Long patientId) {

		logger.info("Getting patient  details with id:" + patientId);
		ResponseDto requestDto = patientService.getPatient(patientId);

		return ResponseEntity.ok(requestDto);

	}

	@GetMapping("/list")
	public ResponseEntity<ResponseDto> getPatientList() {

		logger.info("Getting patient  details with id:");
		ResponseDto requestDto = patientService.getPatients();

		return new ResponseEntity<>(requestDto, HttpStatus.OK);

	}
	@GetMapping("/mylist")
	public ResponseEntity<ResponseDto> getMyPatientList(@RequestParam(required = false, defaultValue = "0") int page,
														@RequestParam(required = false, defaultValue = "25") int size) {

		logger.info("Getting patient  details with id:");
		ResponseDto requestDto = patientService.getMyPatients(page,size);

		return new ResponseEntity<>(requestDto, HttpStatus.OK);

	}
	@GetMapping("/today")
	public ResponseEntity<ResponseDto> getMyTodayPatientList(@RequestParam(required = false, defaultValue = "0") int page,
														@RequestParam(required = false, defaultValue = "25") int size) {

		logger.info("Getting Today patient list ");
		ResponseDto todayPendingPatient = patientService.getMyTodayPatientList(page,size);

		return  new ResponseEntity<>(todayPendingPatient, HttpStatus.OK);

	}
	@GetMapping("/pending")
	public ResponseEntity<ResponseDto> getMyPendingPatientList(@RequestParam(required = false, defaultValue = "0") int page,
														@RequestParam(required = false, defaultValue = "25") int size) {

		logger.info("Getting pending patient list");
		ResponseDto pendingPatient = patientService.getMyPendingPatientList(page, size);

		return new ResponseEntity<>(pendingPatient, HttpStatus.OK);

	}
	@PostMapping("/first-visit")
	public ResponseEntity<ResponseDto> createFirstVisit(@RequestBody @Valid SignificantHistoryDto dto) {

		logger.info("Creating patient visit");
		ResponseDto pendingPatient = patientService.createPatientVisit(dto);

		return new ResponseEntity<>(pendingPatient, HttpStatus.OK);

	}
	@PostMapping("/visit")
	public ResponseEntity<ResponseDto> createPatientVisit(@RequestBody @Valid PatientVisitDto dto) {

		logger.info("Creating patient visit");
		ResponseDto pendingPatient = patientService.createPatientVisits(dto);

		return new ResponseEntity<>(pendingPatient, HttpStatus.OK);

	}
}
