package com.cogent.DiscountService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.furniturecloud.datalayer.DAO;
import com.furniturecloud.datalayer.Discounts;
import com.furniturecloud.datalayer.UserRepo;
import com.furniturecloud.security.utils.LoginResponseDTO;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/Discounts")
@CrossOrigin("*")
public class DiscountController {
	@Autowired
	private DAO<Discounts, UUID> Discounts;
	@Autowired
	private UserRepo user;
	// Missing an annotation to resolve request to User object
	// Need to decide on return values

	// Discount
	@GetMapping("/")
	public String getMethodName() {
		return "Discounts";
	}
	
	@PostMapping("/create")
	public ResponseEntity<?> createDiscount(@Valid @RequestBody Discounts o, BindingResult br) {
		if (!br.hasErrors()) {
			Discounts or = new Discounts(o.getCart(),user.findByEmail(auth.getName()).get());
			Discounts.create(or);

			return ResponseEntity.status(HttpStatus.OK).body(or);
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(br.getAllErrors());
	}

	@DeleteMapping("/Discount/delete/{id}")
	public ResponseEntity<?> deleteDiscount(@PathVariable Long id) {
		Discount.delete(id);
		return ResponseEntity.status(HttpStatus.OK).body("Deleted");
	}

	@GetMapping("/Discount/get/{uuid}")
	public ResponseEntity<?> getDiscount(@Valid @PathVariable UUID uuid) {
		Discounts o = Discounts.get(uuid);
		if (o != null)
			return ResponseEntity.status(HttpStatus.OK).body(o);
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ID");
	}

}