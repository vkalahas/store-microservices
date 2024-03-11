package com.cogent.DiscountService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
class Discount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer discountId;
    private String code;
    private Integer percent;
    
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable=false)
	private User user ;//Used for keeping User and this entity in sync

    public Discount() {
    }

    public Integer getId() {
        return discountId;
    }

    public void setId(Integer discountId) {
        this.discountId = discountId;
    }
}