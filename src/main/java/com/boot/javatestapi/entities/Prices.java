package com.boot.javatestapi.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Prices {
	
	
	/*id MEDIUMINT  NOT NULL AUTO_INCREMENT,
BRAND_ID NUMERIC,
START_DATE DATE,
END_DATE DATE,
PRICE_LIST  NUMERIC,                 
PRODUCT_ID   NUMERIC,
PRIORITY  NUMERIC   ,            
PRICE  FLOAT     ,    
CURR  VARCHAR(50), PRIMARY KEY (id)*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "BRANDID")
	private Long brandid;
	
	@Column(name = "STARTDATE")
	private Date startdate;
	
	@Column(name = "ENDDATE")
	private Date enddate;
	
	@Column(name = "PRICELIST")
	private Long pricelist;
	
	@Column(name = "PRODUCTID")
	private Long productid;
	
	@Column(name = "PRIORITY")
	private Long priority;
	
	@Column(name = "PRICE")
	private Float price;
	
	@Column(name = "CURR")
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

	

}
