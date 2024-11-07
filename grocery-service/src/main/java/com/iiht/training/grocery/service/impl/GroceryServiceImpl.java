package com.iiht.training.grocery.service.impl;

import java.util.List;

import com.iiht.training.grocery.dto.GroceryDto;
import com.iiht.training.grocery.service.GroceryService;
import com.iiht.training.grocery.repository.GroceryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class GroceryServiceImpl implements GroceryService {

	@Autowired
	private GroceryRepository repository;

	@Override
	public GroceryDto addGroceryDetails(GroceryDto GroceryDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<GroceryDto> findGroceryById(Long groceryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
