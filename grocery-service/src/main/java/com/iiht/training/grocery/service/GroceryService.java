package com.iiht.training.grocery.service;

import java.util.List;

import com.iiht.training.grocery.dto.GroceryDto;

public interface GroceryService {

	 GroceryDto addGroceryDetails(GroceryDto groceryDto);
	 List<GroceryDto> findGroceryById(Long id);

}
