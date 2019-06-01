package com.example.stocksapp.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.OneToMany;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;

import com.fasterxml.jackson.annotation.JsonManagedReference;


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
	
	@OneToMany(
	        mappedBy = "stockPrice",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
	private List<Prices> prices = new ArrayList<Prices>();
	
	
	
//	@Override
//	public String toString() {
//		return "\nPerson [Id=" + stockId + ", =" + symbol + ", stockName=" + stockName + ","
//				+ " marketCap=" + marketCap + " sector=" + sector + " industry=" + industry
//				+ " prices=" + prices+"]";
//		
//	}
}
