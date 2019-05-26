package com.example.stocksapp.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.stocksapp.repository.StocksAppRepo;

@Service
public class StocksBusiness {

	@Autowired
	private StocksAppRepo stocksAppRepo;
	
	
}
