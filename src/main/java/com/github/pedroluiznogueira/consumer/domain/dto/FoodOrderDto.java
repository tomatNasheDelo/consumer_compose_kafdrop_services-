package com.github.pedroluiznogueira.consumer.domain.dto;

import lombok.Data;

import lombok.Value;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@Value
public class FoodOrderDto {
	
	private static final Logger logger = LoggerFactory.getLogger(FoodOrderDto.class);
	
	
      String item;
      Double amount;
 
}
