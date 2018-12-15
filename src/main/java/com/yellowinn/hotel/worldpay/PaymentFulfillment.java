package com.yellowinn.hotel.worldpay;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.worldpay.gateway.clearwater.client.core.dto.request.OrderRequest;
import com.worldpay.gateway.clearwater.client.core.dto.response.OrderResponse;
import com.worldpay.gateway.clearwater.client.core.exception.WorldpayException;
import com.worldpay.sdk.WorldpayRestClient;

public class PaymentFulfillment {

	Logger log = LoggerFactory.getLogger(PaymentFulfillment.class);

	void payment() {
		WorldpayRestClient restClient = new WorldpayRestClient(WorldPayConstant.AppSetup.SERVICE_KEY);
		OrderRequest orderRequest = new OrderRequest();
		orderRequest.setToken("valid-token");
		orderRequest.setAmount(1999);
		orderRequest.setCurrencyCode(WorldPayConstant.AppSetup.DEFAULT_CURRENCY);
		orderRequest.setName("test name");
		orderRequest.setOrderDescription("test description");

		try {
			OrderResponse orderResponse = restClient.getOrderService().create(orderRequest);
			log.error("Order code: " + orderResponse.getOrderCode());
		} catch (WorldpayException e) {
			log.error("Error code: " + e.getApiError().getCustomCode());
			log.error("Error description: " + e.getApiError().getDescription());
			log.error("Error message: " + e.getApiError().getMessage());
		}
	}

}
