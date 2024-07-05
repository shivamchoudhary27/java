package com.aiims.antenatalcare.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.aiims.antenatalcare.portal.dto.UserDto;
import com.aiims.antenatalcare.portal.service.AdminService;
import com.aiims.antenatalcare.portal.service.DoctorsService;
import com.aiims.antenatalcare.portal.service.AshaService;

import jakarta.validation.Valid;

@Controller
public class UserController {

	@Autowired
	private AdminService adminService;
	@Autowired
	private DoctorsService doctorsService;

	@Autowired
	private AshaService hospitalService;

	Logger logger = LoggerFactory.getLogger(UserController.class);

	@GetMapping({ "/dashboard", "/", "" })
	public String dashboard(Model model) {

		logger.info("Getting dashboard");
		model.addAttribute("header", "Dashboard");
		long doctorsCount = doctorsService.getDoctorsCount();
		model.addAttribute("doctorsCount", doctorsCount);

		long activeDoctorsCount = doctorsService.countActiveDoctors();
		model.addAttribute("activeDoctorsCount", activeDoctorsCount);

		long healthCareProvidersCount = hospitalService.getHealthProviderCount();
		model.addAttribute("healthCareProvidersCount", healthCareProvidersCount);

		long activeHealthCareProvidersCount = hospitalService.getActiveHealthProviderCount();
		model.addAttribute("activeHealthCareProvidersCount", activeHealthCareProvidersCount);

		return "dashboard/dashboard";
	}

	@GetMapping("/user/profile")
	public String getUserProfile(Model model) {
		logger.info("Getting user profile");
		UserDto profile = adminService.getUserProfile();
		model.addAttribute("profile", profile);
		return "user/profile";
	}

	@PostMapping("/user/profile")
	public String updateUserProfile(@Valid @ModelAttribute UserDto userDto, Model model) {
		logger.info("Updating user profile");

		UserDto profile = adminService.updateUserProfile(userDto);
		model.addAttribute("profile", profile);
		model.addAttribute("updateSuccess", true);

		return "user/profile";
	}

	@GetMapping("/knowledge")
	public String knowledgecenter() {
		return "knowledgeCenter/knowledgeCenter";
	}

	@GetMapping("/patients")
	public String patient(Model model) {
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "Patient List");

		return "doctor/patients";

	}
}