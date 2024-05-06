package com.boot.javatestapi.services;

import java.util.Date;
import java.util.List;

import com.boot.javatestapi.exceptions.JavaTestException;
import com.boot.javatestapi.jsons.PricesRest;

public interface PricesService {
	
	PricesRest getPricesById(Long restaurantId) throws JavaTestException;
	List<PricesRest> getPricesByProductid(Long productId) throws JavaTestException;
	List<PricesRest> getPricesByDate(Date stardate,Date enddate) throws JavaTestException;

	
	public List<PricesRest> getPrices() throws JavaTestException;
	

}
