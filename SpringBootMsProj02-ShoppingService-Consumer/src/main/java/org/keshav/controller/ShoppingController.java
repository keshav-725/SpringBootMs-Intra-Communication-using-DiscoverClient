package org.keshav.controller;

import org.keshav.client.BillingServiceRestConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shopping")
public class ShoppingController {
	@Autowired
	private BillingServiceRestConsumer consumer;
	
	@GetMapping("/info")
	public  String   displayShoppingDetails() {
		return  "Holi Shopping for Family ...."+consumer.getBillingInfo();	
	}
}