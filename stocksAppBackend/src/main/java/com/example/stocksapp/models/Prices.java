package com.example.stocksapp.models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Prices {

	@javax.persistence.Id
	private int priceId;
	
	private Date date;
	private String symbol;
	private double open;
	private double close;
	private double low;
	private double high;
	private double volume;
}
