package com.aiims.antenatalcare.portal.rest.controller;

import com.aiims.antenatalcare.portal.dto.AppointmentDto;
import com.aiims.antenatalcare.portal.dto.ResponseDto;
import com.aiims.antenatalcare.portal.service.AshaService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v2/asha")
public class AshaController {

    Logger logger = LoggerFactory.getLogger(AshaController.class);

    @Autowired
    private AshaService ashaService;
    @PostMapping("/doctor/fix-appointment")
    public ResponseEntity<ResponseDto> createDoctorAppointment(@RequestBody @Valid AppointmentDto dto) {

        logger.info("Getting patient  details with id:" );
        ResponseDto requestDto = ashaService.createDoctorAppointment(dto);
        return ResponseEntity.ok(requestDto);

    }
}
