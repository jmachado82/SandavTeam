package com.boot.javatestapi.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


import com.boot.javatestapi.exceptions.JavaTestException;
import com.boot.javatestapi.jsons.PricesRest;
import com.boot.javatestapi.repositories.PricesRepository;
import com.boot.javatestapi.responses.JavaTestResponse;
import com.boot.javatestapi.services.PricesService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path = "/java-test" + "/v1")

public class PricesController {
	
	
	
	

	@Autowired
	PricesService pricesService;

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "products" + "/{" + "productsId"
			+ "}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public JavaTestResponse<List<PricesRest>>getPricesByProductId(@PathVariable Long productsId) throws JavaTestException {
		return new JavaTestResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK",
				pricesService.getPricesByProductid(productsId));
	}

	
	
	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "/{stardate}/{enddate}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public JavaTestResponse<List<PricesRest>> getPricesByDate(@PathVariable("stardate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date stardate,@PathVariable("enddate")@DateTimeFormat(pattern = "yyyy-MM-dd") Date enddate) throws JavaTestException {
		return new JavaTestResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK",
				pricesService.getPricesByDate(stardate, enddate));
	}
	
	
	
	
	

	@ResponseStatus(HttpStatus.OK)
	@RequestMapping(value = "prices", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public JavaTestResponse<List<PricesRest>> getPrices() throws JavaTestException {
		return new JavaTestResponse<>("Succes", String.valueOf(HttpStatus.OK), "OK", pricesService.getPrices());
	}

}
