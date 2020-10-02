package com.aso.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aso.api.model.Truck;
@Repository
public interface TruckRepository extends JpaRepository<Truck, Long>{
	
}
