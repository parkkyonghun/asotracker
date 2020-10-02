package com.aso.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aso.api.model.LT_DEPSOIL_DET;
import com.aso.api.model.Truck;
import com.aso.api.repository.ClearStockRepository;
import com.aso.api.repository.TruckRepository;

@RestController
@RequestMapping("/api/v1")
public class TruckController {
	
	//Get all Receipt 
	@Autowired
    private TruckRepository truckRepository;
    @GetMapping("/trucks")
    public List<Truck> getAllTrucks() {
        return truckRepository.findAll();
    }
    
    //getAll clear stock
    @Autowired
    private ClearStockRepository clearStockRepository;
    @GetMapping("/stocks")
    public List<LT_DEPSOIL_DET> getAllStock() {
        return clearStockRepository.findAll();
    }
    
    
}

