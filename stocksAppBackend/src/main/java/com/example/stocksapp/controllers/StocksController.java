package com.example.stocksapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.stocksapp.business.StocksBusiness;

@RestController
public class StocksController {

	@Autowired
	private StocksBusiness stocksBusiness;
	
	@RequestMapping("/api/getPointsByCompany")
	public void getPointsByCompany() {
		stocksBusiness.getPointsByCompanyName();
	}
	
	
	
	
	
}
