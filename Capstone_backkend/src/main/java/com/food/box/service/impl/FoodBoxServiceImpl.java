package com.food.box.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.food.box.dao.FoodBoxRepository;
import com.food.box.model.FoodBoxModel;
import com.food.box.service.FoodBoxService;

@Service
public class FoodBoxServiceImpl implements FoodBoxService {
	
	@Autowired
	private FoodBoxRepository dao;

	@Override
	public FoodBoxModel addFood(FoodBoxModel food) {
		return dao.save(food);
	}

	@Override
	public FoodBoxModel updateFood(FoodBoxModel food) {
		return dao.save(food);
	}

	@Override
	public void deleteFoodById(int id) {
		dao.deleteById(id);
	}

	@Override
	public FoodBoxModel getFoodById(int id) {
		return dao.findById(id).get();
	}

	@Override
	public List<FoodBoxModel> getAllFoods() {
		return dao.findAll();
	}

}
