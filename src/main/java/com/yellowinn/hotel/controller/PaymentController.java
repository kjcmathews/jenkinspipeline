package com.yellowinn.hotel.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yellowinn.hotel.model.BookingModel;

@Controller
public class PaymentController {

	Logger log = LoggerFactory.getLogger(PaymentController.class);

	@RequestMapping(method = RequestMethod.POST, value = "/complete", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, produces = {
			MediaType.APPLICATION_ATOM_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
	void processPayment(@RequestBody BookingModel bookingModel) {
		bookingModel.getToken();

		log.info(bookingModel.getToken());
		// return ControllerConstant.Page.HOME_PAGE;
	}
}
