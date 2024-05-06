package com.boot.javatestapi.repositories;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boot.javatestapi.entities.Prices;

@Repository
public interface PricesRepository extends JpaRepository<Prices, Long> {
	
	Optional<Prices> findById(Long id);
	List<Prices> findByProductid(Long productid);
	Optional<Prices> findByPriority(Long priority);
	Optional<Prices> findByCurr(Long curr);
	List<Prices> findByStartdateAfterAndEnddateBefore(Date stardate,Date enddate);
	
	
	
	//Optional<Prices> findByBrandId(String brandId);
	
	@Query("SELECT p FROM Prices p")
	public List<Prices> findPricesDinamico();

}
