package com.food.dao;

import java.util.List;

import com.food.modules.Order;

public interface OrderDao {
	void addOrder(Order order);
	Order getOrder(int orderId);
	void updateOrder(Order order);
	void deleteOrder(int orderId);
	List<Order> getAllOrdersByUser(int userId);
}
