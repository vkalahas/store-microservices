package com.furniturecloud.reports;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/reports")
public class ReportsController {
	@GetMapping("/get")
	public ReportsDTO getOrders(@RequestBody ReportsDTO body) {
			
		return new String();
	}
	
	
}
