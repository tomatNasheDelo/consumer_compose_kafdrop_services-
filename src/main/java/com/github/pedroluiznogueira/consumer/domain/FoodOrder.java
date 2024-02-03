package com.github.pedroluiznogueira.consumer.domain;

import lombok.AllArgsConstructor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class FoodOrder {
	
	private static final Logger logger = LoggerFactory.getLogger(FoodOrder.class);

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String item;
    private Double amount;
	public Long getId() {
		return id;
	}
	
	public FoodOrder() {
		logger.info("eto rabota konstructora bez argumentov");	
	}
	
	
	public FoodOrder(Long id, String item, Double amount) {
		super();
		this.id = id;
		this.item = item;
		this.amount = amount;
		
		logger.info(" suchnostj :" + "id :"+id+" "+" item: "+item+" amount :"+amount);
		
		
	}


	public void setId(Long id) {
		logger.info("eto setId :"+id);
		this.id = id;
	}
	public String getItem() {
		logger.info("eto getItem :"+item);
		return item;
		
	}
	public void setItem(String item) {
		this.item = item;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
    
    
}
