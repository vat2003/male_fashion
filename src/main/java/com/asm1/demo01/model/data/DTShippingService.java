package com.asm1.demo01.model.data;

import java.util.HashMap;
import java.util.Map;

import com.asm1.demo01.model.ShippingService;

public class DTShippingService {
	public static Map<Integer, ShippingService> item = new HashMap<>();
	static {
		item.put(1, new ShippingService(1, "Postal", 4.2, 5));
		item.put(2, new ShippingService(2, "Express Services", 7.99, 3));
		item.put(3, new ShippingService(3, "Economical", 3.3, 7));
	}
}
