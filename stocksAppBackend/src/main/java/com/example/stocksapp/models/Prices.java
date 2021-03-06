package com.example.stocksapp.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

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
	 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stockId")
	private Stocks stockPrice;
	
//	@Override
//	public String toString() {
//		return "\nPricesOfStock [prices="  + ", =" + open + ", close=" + close + ","
//				+ " low=" + low + " high=" + high + " volume=" + volume
//				+ "]";
//	}
	
}
