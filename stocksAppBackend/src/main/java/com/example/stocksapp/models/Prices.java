package com.example.stocksapp.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Prices {

	@javax.persistence.Id  @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int priceId;
	
	private Date date;
	private String symbol;
	private double open;
	private double close;
	private double low;
	private double high;
	private double volume;
	
	@ManyToOne
	@JoinColumn(name = "stockId")
	private Stocks stock;
	
	@Override
	public String toString() {
		return "\nPricesOfStock [stock=" + stock.toString() + ", =" + open + ", close=" + close + ","
				+ " low=" + low + " high=" + high + " volume=" + volume
				+ "]";
		
	}
	
}
