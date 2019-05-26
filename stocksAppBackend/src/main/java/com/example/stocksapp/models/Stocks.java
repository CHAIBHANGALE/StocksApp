package com.example.stocksapp.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Stocks {

	@Id
	private int stockId;
	
	private String symbol;
	private String stockName;
	private String marketCap;
	private String sector;
	private String industry;
}
