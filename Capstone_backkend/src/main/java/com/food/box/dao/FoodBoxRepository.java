package com.food.box.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.food.box.model.FoodBoxModel;

@Repository
public interface FoodBoxRepository extends JpaRepository<FoodBoxModel, Integer>{

}
