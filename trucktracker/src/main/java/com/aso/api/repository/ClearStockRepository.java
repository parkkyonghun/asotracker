package com.aso.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aso.api.model.LT_DEPSOIL_DET;

public interface ClearStockRepository extends JpaRepository<LT_DEPSOIL_DET, Long> {
	
}
