package com.github.pedroluiznogueira.consumer.service;


import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pedroluiznogueira.consumer.domain.FoodOrder;
import com.github.pedroluiznogueira.consumer.repository.FoodOrderRepository;



@Service
public class FoodOrderService {
	
	private Logger logger = Logger.getLogger(FoodOrderService.class.getName());

    private final FoodOrderRepository foodOrderRepository;

    @Autowired
    public FoodOrderService(FoodOrderRepository foodOrderRepository) {
        this.foodOrderRepository = foodOrderRepository;
    }

    public void persistFoodOrder(FoodOrder foodOrder) {
        FoodOrder persistedFoodOrder = foodOrderRepository.save(foodOrder);
       logger.info("food order persisted {}"+persistedFoodOrder);
    }

}
