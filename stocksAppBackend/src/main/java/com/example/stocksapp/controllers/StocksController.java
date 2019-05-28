package com.example.stocksapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.stocksapp.business.StocksBusiness;

@Controller
public class StocksController {

	@Autowired
	private StocksBusiness stocksBusiness;
	
	
	
	
}
