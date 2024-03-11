package com.cogent.DiscountService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Integer>{
	Optional<Discount> findByUser_id(Integer userId);
}