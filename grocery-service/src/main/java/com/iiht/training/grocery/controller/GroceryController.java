package com.iiht.training.grocery.controller;


import com.iiht.training.grocery.dto.GroceryDto;
import com.iiht.training.grocery.service.GroceryService;
import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class GroceryController {

	@Autowired
	private GroceryService groceryService;

	@PostMapping("/grocery")
	public ResponseEntity<GroceryDto> addGroceryDetails(@Valid @RequestBody GroceryDto groceryDto,
														 BindingResult result) {
		return null;
	}
	// get grocery details by id
	@GetMapping("/grocery/{id}")
	public ResponseEntity<List<GroceryDto>> getGroceryById(@PathVariable Long id) {
		return null;
	}
}
