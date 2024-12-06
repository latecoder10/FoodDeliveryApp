package com.food.dao;

import java.util.List;

import com.food.modules.Menu;

public interface MenuDao {
	void addMenu(Menu menu);
	Menu getMenu(int menuId);
	void updateMenu(Menu menu);
	void deleteMenu(int menuId);
	List<Menu> getAllMenusByRestaurant(int restaurantId);
}
