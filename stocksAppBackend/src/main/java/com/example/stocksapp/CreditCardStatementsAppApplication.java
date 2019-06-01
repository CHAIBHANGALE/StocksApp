package com.example.stocksapp;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.jni.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.stocksapp.repository.StocksAppRepo;



@SpringBootApplication
public class CreditCardStatementsAppApplication {

	//private static com.example.stocksapp.repository.StocksAppRepo stocksAppRepo = new StocksAppRepo();
	
	public static int count(String filename) throws IOException {
		
	    InputStream is = new BufferedInputStream(new FileInputStream(filename));
	    try {
	    byte[] c = new byte[1024];
	    int count = 0;
	    int readChars = 0;
	    boolean empty = true;
	    while ((readChars = is.read(c)) != -1) {
	        empty = false;
	        for (int i = 0; i < readChars; ++i) {
	            if (c[i] == '\n') {
	                ++count;
	            }
	        }
	    }
	    return (count == 0 && !empty) ? 1 : count;
	    } finally {
	    is.close();
	   }
	}
	
	public static void main(String[] args) throws IOException {
		
		//int count = count("C:\\Program Files\\MongoDB\\Server\\4.0\\bin\\prices763fefc.csv");
		
		//System.out.println("Count of lines  " + count );
		SpringApplication.run(CreditCardStatementsAppApplication.class, args);
		
		//stocksAppRepo.findCarsByYearWithNamedStored();
	}

}
