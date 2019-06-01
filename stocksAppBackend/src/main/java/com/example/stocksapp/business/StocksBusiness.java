package com.example.stocksapp.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.stocksapp.models.FilterModel;
import com.example.stocksapp.models.Prices;
import com.example.stocksapp.models.Stocks;
import com.example.stocksapp.repository.StocksAppRepo;


@Service
public class StocksBusiness {

	@Autowired
	private StocksAppRepo stocksAppRepo;
	
	public Stocks getPointsByCompanyName(String companyName) {
		return stocksAppRepo.findByStockName(companyName); 
	}
	
	public List<Prices> getBestandWorstByDate(FilterModel filterDate) {
		return stocksAppRepo.getBestandWorstByDate(filterDate.startDate,filterDate.endDate); 
	}
	
	
	
}
