package com.example.stocksapp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;


@Entity
@NamedStoredProcedureQueries({
	  @NamedStoredProcedureQuery(
	    name = "GetPricePoints", 
	    procedureName = "getPricePoints", 
	    resultClasses = { Prices.class }, 
	    parameters = { 
	        @StoredProcedureParameter(
	          name = "c_name", 
	          type = String.class, 
	          mode = ParameterMode.IN) }) 
	})
public class Stocks {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int stockId;
	
	private String symbol;
	private String stockName;
	private String marketCap;
	private String sector;
	private String industry;
	
	
	@Override
	public String toString() {
		return "\nPerson [Id=" + stockId + ", =" + symbol + ", stockName=" + stockName + ","
				+ " marketCap=" + marketCap + " sector=" + sector + " industry=" + industry
				+ "]";
		
	}
}
