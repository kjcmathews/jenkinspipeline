package com.yellowinn.hotel.worldpay;

import com.worldpay.gateway.clearwater.client.core.dto.CurrencyCode;

public class WorldPayConstant {

	private WorldPayConstant () {
		
	}
	
	public static class AppSetup{
		public static final String SERVICE_KEY="XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXx";
		public static final CurrencyCode DEFAULT_CURRENCY = CurrencyCode.THB;
	}
	
}
