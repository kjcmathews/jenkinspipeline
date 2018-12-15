package com.yellowinn.hotel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yellowinn.hotel.ControllerConstant;

@Controller
public class MainPageController {

	@RequestMapping(method = RequestMethod.GET, value = "/")
	String mainPage(Model model) {
		return ControllerConstant.Page.HOME_PAGE;
	}
}
