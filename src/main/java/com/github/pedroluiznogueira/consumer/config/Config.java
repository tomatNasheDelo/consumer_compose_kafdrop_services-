package com.github.pedroluiznogueira.consumer.config;

import org.apache.kafka.clients.producer.ProducerConfig;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@EnableKafka
@Configuration
public class Config {
	
	private static final Logger logger = LoggerFactory.getLogger(Config.class);

    @Bean
    public ModelMapper modelMapper() {
    	
    	logger.info("Srabotal ModelMapper[][][][][][][]Config");
        return new ModelMapper();
    }

}
