package com.furniturecloud.reports;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/reports")
public class ReportsController {
	@Autowired
    private OrderService ordersService;
   @GetMapping("/between-times")
    public ResponseEntity<ReportsDTO> getOrdersBetweenTimes(@RequestParam("startTime") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") Date startTime,
                                                            @RequestParam("endTime") @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") Date endTime) {
        ReportsDTO reportsDTO = ordersService.getOrdersBetweenTimes(startTime, endTime);
        return ResponseEntity.ok().body(reportsDTO);
    }
	
	
}
