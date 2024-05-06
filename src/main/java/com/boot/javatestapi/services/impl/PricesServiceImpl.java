package com.boot.javatestapi.services.impl;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.javatestapi.entities.Prices;
import com.boot.javatestapi.exceptions.JavaTestException;
import com.boot.javatestapi.exceptions.NotFountException;
import com.boot.javatestapi.jsons.PricesRest;
import com.boot.javatestapi.repositories.PricesRepository;
import com.boot.javatestapi.services.PricesService;

@Service
public class PricesServiceImpl implements PricesService {

	@Autowired
	PricesRepository pricesRepository;

	public static final ModelMapper modelMapper = new ModelMapper();

	public PricesRest getPricesById(Long restaurantId) throws JavaTestException {
		return modelMapper.map(getPricesEntity(restaurantId), PricesRest.class);
	}

	
	
	/*private Prices getPricesProductEntity(Long productid) throws JavaTestException {
		return pricesRepository.findByProductid(productid)
				.orElseThrow(() -> new NotFountException("SNOT-404-1", "PRICES_NOT_FOUND"));
	}*/
	

	private Prices getPricesEntity(Long pricesId) throws JavaTestException {
		return pricesRepository.findById(pricesId)
				.orElseThrow(() -> new NotFountException("SNOT-404-1", "PRICES_NOT_FOUND"));
	}
	public List<PricesRest> getPrices() throws JavaTestException {
		final List<Prices> restaurantsEntity = pricesRepository.findAll();
		return restaurantsEntity.stream().map(service -> modelMapper.map(service, PricesRest.class))
				.collect(Collectors.toList());
	}

	
	public List<PricesRest> getPricesByProductid(Long productId) throws JavaTestException {
		final List<Prices> pricesEntity = pricesRepository.findByProductid(productId);
		return pricesEntity.stream().map(service -> modelMapper.map(service, PricesRest.class))
				.collect(Collectors.toList());
	}



	@Override
	public List<PricesRest> getPricesByDate(Date stardate, Date enddate) throws JavaTestException {
		final List<Prices> pricesEntity = pricesRepository.findByStartdateAfterAndEnddateBefore(stardate, enddate);
		return pricesEntity.stream().map(service -> modelMapper.map(service, PricesRest.class))
				.collect(Collectors.toList());
	}



	


}
