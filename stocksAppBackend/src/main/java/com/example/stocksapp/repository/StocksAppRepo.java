package com.example.stocksapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.stocksapp.models.Stocks;

@Repository
public interface StocksAppRepo extends JpaRepository<Stocks, Integer>{
	
}
