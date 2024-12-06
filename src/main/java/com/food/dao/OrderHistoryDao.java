package com.food.dao;

import java.util.List;

import com.food.modules.OrderHistory;

public interface OrderHistoryDao {
	void addOrderHistory(OrderHistory orderHistory);
	OrderHistory getOrderHistory(int orderHistoryId);
	void updateOrderHistory(OrderHistory orderHistory);
	void deleteOrderHistory(int orderHistoryId);
	List<OrderHistory> getAllOrderHistoriesByUser(int userId);
}
