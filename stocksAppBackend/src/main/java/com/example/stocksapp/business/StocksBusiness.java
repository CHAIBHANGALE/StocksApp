package com.example.stocksapp.business;

import javax.ejb.EJB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stocksapp.models.Stocks;
import com.example.stocksapp.repository.StocksAppRepo;

import antlr.collections.List;

@Service
public class StocksBusiness {

	@Autowired
	private StocksAppRepo stocksAppRepo;
	
	public void getPointsByCompanyName() {
		stocksAppRepo.findAll().forEach(price -> System.out.println(price.toString())); 
	}
	
	
}
