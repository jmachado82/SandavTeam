package com.boot.javatestapi.controllers;





import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.boot.javatestapi.controllers.PricesController;
import com.boot.javatestapi.exceptions.JavaTestException;
import com.boot.javatestapi.jsons.PricesRest;
import com.boot.javatestapi.responses.JavaTestResponse;
import com.boot.javatestapi.services.PricesService;





public class PriceControllerTest {
	
	private static final Long BRANDID=1L;
	private static final String CURR="EUR";
	private static  Date ENDDATE1=new Date();
	private static  Date ENDDATE2=new Date();
	private static  Date ENDDATE3=new Date();
	private static final Long ID=1L;
	private static final float PRICE=(float) 35.5;
	private static final Long PRIORITY=1L;
	private static final Long PRODUCTID=35455L;
	private static Date STARDATE1=new Date();
	private static  Date STARDATE2=new Date();
	private static  Date STARDATE3=new Date();
	
	private static final String SUCCES_STATUS="Succes";
	private static final String SUCCES_CODE="200 OK";
	private static final String OK="OK";
	
	public  static final PricesRest PRICE_REST=new PricesRest();
	public  static final List<PricesRest> PRICE_REST_LIST=new ArrayList<>();
	
	private static final String cadStarDate1="2024-04-14";
	private static final String cadStarDate2="2024-04-15";
	private static final String cadStarDate3="2024-04-16";
	private static final String cadEndDate1="2024-04-14";
	private static final String cadEndDate2="2024-04-15";
	private static final String cadEndDate3="2024-04-16";
	
	@Mock
	PricesService pricesService;
	@InjectMocks
	PricesController pricesController;
	
	@Before
	public void init() throws JavaTestException{
		MockitoAnnotations.initMocks(this);
		
		
		
		
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		
		try {
			STARDATE1=formato.parse(cadStarDate1);
			STARDATE2=formato.parse(cadStarDate2);
			STARDATE3=formato.parse(cadStarDate3);
			
			ENDDATE1=formato.parse(cadEndDate1);
			ENDDATE2=formato.parse(cadEndDate2);
			ENDDATE3=formato.parse(cadEndDate3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		PRICE_REST.setBrandid(BRANDID);
		PRICE_REST.setCurr(CURR);
		PRICE_REST.setEnddate(ENDDATE1);
		PRICE_REST.setId(ID);
		PRICE_REST.setPrice(PRICE);
		PRICE_REST.setPriority(PRIORITY);
		PRICE_REST.setProductid(PRODUCTID);
		PRICE_REST.setStartdate(STARDATE1);
		Mockito.when(pricesService.getPricesById(ID)).thenReturn(PRICE_REST);
		
	}
	

	
	@Test
	public void getPricesByDateIdTest_1() throws JavaTestException {
		final JavaTestResponse<List<PricesRest>> response=pricesController.getPricesByDate(STARDATE1, ENDDATE1);
		assertEquals(response.getStatus(), SUCCES_STATUS);
		assertEquals(response.getCode(), SUCCES_CODE);
		assertEquals(response.getMessage(), OK);
		assertEquals(response.getData(), PRICE_REST_LIST);
		
	}
	
	@Test
	public void getPricesByDateIdTest_2() throws JavaTestException {
		final JavaTestResponse<List<PricesRest>> response=pricesController.getPricesByDate(STARDATE2, ENDDATE2);
		assertEquals(response.getStatus(), SUCCES_STATUS);
		assertEquals(response.getCode(), SUCCES_CODE);
		assertEquals(response.getMessage(), OK);
		assertEquals(response.getData(), PRICE_REST_LIST);
		
	}
	
	@Test
	public void getPricesByDateIdTest_3() throws JavaTestException {
		final JavaTestResponse<List<PricesRest>> response=pricesController.getPricesByDate(STARDATE3, ENDDATE3);
		assertEquals(response.getStatus(), SUCCES_STATUS);
		assertEquals(response.getCode(), SUCCES_CODE);
		assertEquals(response.getMessage(), OK);
		assertEquals(response.getData(), PRICE_REST_LIST);
		
	}
	
}
