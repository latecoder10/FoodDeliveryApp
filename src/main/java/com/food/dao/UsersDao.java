package com.food.dao;

import java.util.List;

import com.food.modules.Users;

public interface UsersDao {
	void addUser(Users user);
	Users getUser(int userId);
	void updateUser(Users user);
	void deleteUser(int userId);
	List<Users> getAllUsers();
}
