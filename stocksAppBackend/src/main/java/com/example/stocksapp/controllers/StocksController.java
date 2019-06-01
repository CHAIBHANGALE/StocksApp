package com.example.stocksapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.stocksapp.business.StocksBusiness;
import com.example.stocksapp.models.FilterModel;
import com.example.stocksapp.models.Prices;
import com.example.stocksapp.models.Stocks;

@RestController
public class StocksController {

	@Autowired
	private StocksBusiness stocksBusiness;
	
	@RequestMapping(value="/api/getPointsByCompany",
			method=RequestMethod.GET)
	public Stocks getPointsByCompany(@RequestParam(value = "c_name") String companyName) {
		return stocksBusiness.getPointsByCompanyName(companyName);
	}
	
	@RequestMapping(value="/api/getTopandWorstPerformingStocks",
			method=RequestMethod.POST)
	public List<Prices> getWorstandBestStocksbyDate(@RequestParam(value = "date_filter") FilterModel filtermodel) {
		return stocksBusiness.getBestandWorstByDate(filtermodel);
	}
	
//	@RequestMapping(value="/api/getStocksinTime",
//			method=RequestMethod.POST)
//	public Stocks getStocksinTime(@RequestParam(value = "stockData") ) {
//		
//	}
//	
	
	
	
}
