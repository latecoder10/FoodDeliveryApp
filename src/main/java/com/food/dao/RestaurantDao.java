package com.food.dao;

import java.util.List;

import com.food.modules.Restaurant;

public interface RestaurantDao {
	void addRestaurant(Restaurant restaurant);
	Restaurant getRestaurant(int restaurantId);
	void updateRestaurant(Restaurant restaurant);
	void deleteRestaurant(int restaurantId);
	List<Restaurant> getAllRestaurant();
}
