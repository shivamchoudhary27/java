package com.aiims.antenatalcare.portal.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aiims.antenatalcare.portal.dto.HospitalAshaDto;
import com.aiims.antenatalcare.portal.service.AshaService;

@Controller
public class HealthcareProviderController {

	@Autowired
	private AshaService hospitalAshaService;
	
	
	Logger logger = LoggerFactory.getLogger(DoctorController.class);


	// handler method to handle list of providers and return mode and view
	@GetMapping("/hcprovider/list")
	public String listProvider(Model model,
			@RequestParam(name = "searchKeyword", required = false) String searchKeyword,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {

		Page<HospitalAshaDto> providerPage = hospitalAshaService.getAllProviders(searchKeyword, page, size);
		
		logger.info("getting hc_provider_lists");

		// Get the list of providers from the page
		List<HospitalAshaDto> providers = providerPage.getContent();
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header" ,"Healthcare Provider List");

		// Add the provider list and searchKeyword to the model
		model.addAttribute("provider_list", providers);
		model.addAttribute("searchKeyword", searchKeyword);

		// Add pagination information to the model
		model.addAttribute("currentPage", page);
		model.addAttribute("pageSize", size);
		model.addAttribute("totalPages", providerPage.getTotalPages());
		return "hcprovider/hc_provider_lists";
	}

	@GetMapping(value = "/hcprovider/registration")
	public String registration(Model model) {
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header", "HealthCare Registration");
		return "hcprovider/hcRegistration";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute("Provider") HospitalAshaDto provider, Model model) {
		this.hospitalAshaService.createHealthProvider(provider);
		model.addAttribute("title", "Antenatal Care Web Portal");
		return "hcprovider/success_Page";
	}

	// for AvailableHealthCareProviders

	@GetMapping(value = "/available/hcprovider")
	public String listAvailableHealthcareProviders(Model model, 

			@RequestParam(name = "searchKeyword", required = false) String searchKeyword,
			@RequestParam(name = "page", defaultValue = "0") int page,
			@RequestParam(name = "size", defaultValue = "10") int size) {
	    Page<HospitalAshaDto> providerPAge = hospitalAshaService.getAllProviders(searchKeyword, page, size);
		List<HospitalAshaDto> providers = providerPAge.getContent();
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header" ,"Assign Doctor");
		
	    model.addAttribute("availableHealthcareProvider", providers);
	    model.addAttribute("searchKeyword", searchKeyword);
		// Add pagination information to the model
		model.addAttribute("currentPage", page);
		model.addAttribute("pageSize", size);
		model.addAttribute("totalPages", providerPAge.getTotalPages());
	    return "hcprovider/assign_doctor";
	}
	

	// for Delete Data
	@PostMapping("/delete-provider")
	public String deleteProvider(@RequestParam("id") Long providerId, RedirectAttributes redirectAttributes) {
		hospitalAshaService.delete(providerId);
		redirectAttributes.addFlashAttribute("deleteSuccess", true);
		redirectAttributes.addFlashAttribute("message", "Delete Successful!!!");
		redirectAttributes.addFlashAttribute("alertClass", "alert-danger");
		return "redirect:hcprovider/list";
	}

	@GetMapping(value = "/hcprovider/update/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model) {
		HospitalAshaDto dto = hospitalAshaService.getProviderById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("title", "Antenatal Care Web Portal");
		model.addAttribute("header" ,"HealthCare Provider Updation");
		return "hcprovider/hcUpdation";
	}

	@PostMapping("/saveProvider/{id}")
	public String saveProvider(@PathVariable("id") Long id, @ModelAttribute("dto") HospitalAshaDto dto,
			RedirectAttributes redirectAttributes) {
		hospitalAshaService.updateProvider(id, dto);
		redirectAttributes.addFlashAttribute("updateSuccess", true);
		redirectAttributes.addFlashAttribute("message", "Update successful!");
		return "redirect:/hcprovider/list";
	}
}
