package com.aiims.antenatalcare.portal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping()
public class PublicController extends BaseController {

	Logger logger = LoggerFactory.getLogger(PublicController.class);

	@GetMapping(value = "/login")
	public String getLoginPage(@RequestParam(defaultValue = "false") Boolean failure, Model model) {
		model.addAttribute("failure", failure);
		return "auth/login";

	}

	@GetMapping(value = "/logout")
	public String getCodeCallbackPage(HttpServletResponse response) {

		Cookie cookie = new Cookie("JSESSIONID", null);
		cookie.setMaxAge(0);
		cookie.setPath("/");
		response.addCookie(cookie);

		return "auth/logout";
	}

}