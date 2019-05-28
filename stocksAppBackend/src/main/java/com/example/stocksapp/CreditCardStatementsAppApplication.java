package com.example.stocksapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stocksapp.repository.StocksAppRepo;



@SpringBootApplication
public class CreditCardStatementsAppApplication {

	//private static com.example.stocksapp.repository.StocksAppRepo stocksAppRepo = new StocksAppRepo();
	
	public static void main(String[] args) {
		SpringApplication.run(CreditCardStatementsAppApplication.class, args);
		
		//stocksAppRepo.findCarsByYearWithNamedStored();
	}

}
