package com.boot.javatestapi.jsons;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class PricesRest {

	@JsonProperty("id")
	private Long id;
	
	@JsonProperty("brandid")
	private Long brandid;
	
	@JsonProperty("startdate")
	private Date startdate;
	
	@JsonProperty("enddate")
	private Date enddate;
	
	@JsonProperty("pricelist")
	private Long pricelist;
	
	@JsonProperty("productid")
	private Long productid;
	
	@JsonProperty("priority")
	private Long priority;
	
	@JsonProperty("price")
	private Float price;
	
	@JsonProperty("curr")
	private String curr;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBrandid() {
		return brandid;
	}

	public void setBrandid(Long brandid) {
		this.brandid = brandid;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public Long getPricelist() {
		return pricelist;
	}

	public void setPricelist(Long pricelist) {
		this.pricelist = pricelist;
	}

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Long getPriority() {
		return priority;
	}

	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getCurr() {
		return curr;
	}

	public void setCurr(String curr) {
		this.curr = curr;
	}

	
/*@Column(name = "BRAND_ID")
	private Long brand_id;
	
	@Column(name = "START_DATE")
	private Date start_date;
	
	@Column(name = "END_DATE")
	private Date end_date;
	
	@Column(name = "PRICE_LIST")
	private Long price_list;
	
	@Column(name = "PRODUCT_ID")
	private Long product_id;
	
	@Column(name = "PRIORITY")
	private Long priority;
	
	@Column(name = "PRICE")
	private Long price;
	
	@Column(name = "CURR")
	private Long curr;
	*/


}
