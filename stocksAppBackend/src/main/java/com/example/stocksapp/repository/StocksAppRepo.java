package com.example.stocksapp.repository;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.stocksapp.models.FilterModel;
import com.example.stocksapp.models.Prices;
import com.example.stocksapp.models.Stocks;

@Repository
@Transactional
public interface StocksAppRepo extends JpaRepository<Stocks,Integer>{
	
	public Stocks findByStockName(String symbol);
	
	@Query("SELECT * FROM Prices p where date > ?1 and date<?2 order by (p.high - p.close) desc")
	public List<Prices> getBestandWorstByDate(Date startDate,Date endDate);
	
	
//	@PersistenceContext
//	EntityManager entityManager;
//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("StocksBusiness");
//	EntityManager entityManager = emf.createEntityManager();
//    	 
//	public void findCarsByYearWithNamedStored() {
//		
//		System.out.println(entityManager);
//		
//	    StoredProcedureQuery findByYearProcedure = 
//	      entityManager.createStoredProcedureQuery("getPricePoints");
//	     
//	    
//	    
//	    StoredProcedureQuery storedProcedure = 
//	      findByYearProcedure.setParameter("c_name", "1347 Property Insurance Holdings, Inc.");
//	     
//	    System.out.println(storedProcedure.getResultList().toString()); 
//	       
//	}
	
}
	