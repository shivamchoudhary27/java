package com.aiims.antenatalcare.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aiims.antenatalcare.portal.dto.HospitalDoctorsDto;
import com.aiims.antenatalcare.portal.service.DoctorsService;

import jakarta.validation.Valid;

@Controller
@RequestMapping(path = "doctor")
public class DoctorController {

	@Autowired
	private DoctorsService doctorsService;

	Logger logger = LoggerFactory.getLogger(DoctorController.class);

	// For Registration...
	@GetMapping(value = "/edit")
	public String registration( Model model) {
		logger.info("Getting doctor registration page");
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "Doctor Registration");
		model.addAttribute("dto", new HospitalDoctorsDto() );
		return "doctor/edit";
	}

	// for Registration
	@PostMapping(value = "/edit")
	public String edit(@Valid @ModelAttribute("dto") HospitalDoctorsDto dto, Model model, BindingResult bindingResult) {
		logger.info("Getting doctor registration page");
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "Doctor Registration");
		
		if (bindingResult.hasErrors()) {
		       
	        return "doctor/edit";
	    }
		
		String message = ""; 
		try {
			this.doctorsService.editDoctor(dto);
			model.addAttribute("message", "doctor register succesfully");
			model.addAttribute("dto", new HospitalDoctorsDto());
		} catch (Exception e) {
			//e.printStackTrace();
			logger.error(e.getMessage());
		//	model.addAttribute("message", "An error occurred: " + e.getMessage());
		}
		
		return "doctor/edit";
	}

	// For checking the Dostor's List...
	@GetMapping(value = "/list")
	public String doctorList(Model model, @RequestParam(name = "searchKeyword", required = false) String searchKeyword,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {

		Page<HospitalDoctorsDto> doctorsPage = doctorsService.getAllDoctors(searchKeyword, page, size);

		List<HospitalDoctorsDto> providers = doctorsPage.getContent();
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "Doctor List");
		model.addAttribute("doctorList", providers);
		model.addAttribute("searchKeyword", searchKeyword);

		model.addAttribute("currentPage", page);
		model.addAttribute("pageSize", size);
		model.addAttribute("totalPages", doctorsPage.getTotalPages());

		return "doctor/doctorList";
	}

	// For Assigning HealthCare Provider...
	@GetMapping(value = "/assign_hc_provider")
	public String assign_HC_provider(Model model) {
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "Assign HealthCare Provider");
		return "doctor/assign_HC_provider";
	}

	// For deleting the doctor from list...
	@GetMapping("/delete/{doctorId}")
	public String deleteDoctor(@PathVariable("doctorId") Long doctorId, Model model,
			RedirectAttributes redirectAttributes) {
		logger.info(" Deleting doctor");
		doctorsService.delete(doctorId);
		
		 redirectAttributes.addFlashAttribute("deleteSuccess", true);
		 redirectAttributes.addFlashAttribute("message", " doctor Delete Successful!!!");
		 redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
		 
		return "redirect:/doctor/list";
	}

	// For Update the doctor Details...
	@GetMapping(value = "/updateDoctor/{doctorId}")
	public String showEditForm(@PathVariable("doctorId") Long doctorId, Model model) {
		logger.info("Getting doctor updation page");
		HospitalDoctorsDto dto = doctorsService.getDoctor(doctorId);
	
		model.addAttribute("dto", dto);
		model.addAttribute("header", "Update Doctor Details");
		model.addAttribute("title", "Antenatal Care Web Portal");
		return "doctor/docUpdation";
	}

	// For Update Alert...
	@PostMapping("/saveDoctor/{doctorId}")
	public String saveDoctor(@PathVariable("doctorId") Long doctorId, @Valid @ModelAttribute("dto") HospitalDoctorsDto dto,
			BindingResult bindingResult,Model model, RedirectAttributes redirectAttributes) {
		logger.info("Starting doctor updation");
		
		if (bindingResult.hasErrors()) {
	       
	        return "doctor/docUpdation";
	    }
		
		doctorsService.updateDoctor(doctorId, dto);
	      
		
		return "redirect:/doctor/list";
	}

	// Get Doctor By Id
	@GetMapping("/getdoctordetails/{doctorId}")
	public ResponseEntity<HospitalDoctorsDto> getDoctorDetails(@PathVariable Long doctorId) {
		HospitalDoctorsDto doctorsDto = this.doctorsService.getDoctor(doctorId);

		return new ResponseEntity<>(doctorsDto, HttpStatus.OK);
	}
}
