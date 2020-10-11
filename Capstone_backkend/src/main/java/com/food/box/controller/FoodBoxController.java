package com.food.box.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.food.box.model.FoodBoxModel;
import com.food.box.service.FoodBoxService;
@CrossOrigin(origins="http://localhost:4200")
@RestController
public class FoodBoxController {

	@Autowired
	private FoodBoxService service;
	
	@PostMapping("/food")
	public FoodBoxModel addFood(@RequestBody FoodBoxModel food) {
		return service.addFood(food);
	}

	@PutMapping("/food")
	public FoodBoxModel updateFood(@RequestBody FoodBoxModel food) {
		return service.updateFood(food);
	}

	@DeleteMapping("/food/{id}")
	public void deleteFoodById(@PathVariable int id) {
		service.deleteFoodById(id);
	}

	@GetMapping("/food/{id}")
	public FoodBoxModel getFoodById(@PathVariable int id) {
		return service.getFoodById(id);
	}

	@GetMapping("/foods")
	public List<FoodBoxModel> getAllFoods() {
		return service.getAllFoods();
	}

}
