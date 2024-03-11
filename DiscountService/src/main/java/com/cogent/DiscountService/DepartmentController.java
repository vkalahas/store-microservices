package com.cogent.DiscountService;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/discount")
public class DepartmentController {
	
	@GetMapping()
	public ResponseEntity<Integer> getDiscount(@RequestBody String order) {
		
		int discountValue = (int) Math.random() * 10;
		
		// edit later maybe
		return ResponseEntity.status(HttpStatus.OK).body(discountValue);
	}
	
}
