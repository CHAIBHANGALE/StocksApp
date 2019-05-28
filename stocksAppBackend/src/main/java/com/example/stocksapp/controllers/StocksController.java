package com.example.stocksapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.stocksapp.business.StocksBusiness;

@RestController
public class StocksController {

	@Autowired
	private StocksBusiness stocksBusiness;
	
	@RequestMapping(value="/api/getPointsByCompany",
			method=RequestMethod.GET)
	public String getPointsByCompany(@RequestParam(value = "c_name") String companyName) {
		return stocksBusiness.getPointsByCompanyName(companyName);
	}
	
	
	
	
	
}
