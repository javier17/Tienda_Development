package com.tienda.service;


import com.tienda.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	public User getUserById(Long id) throws Exception;
	
	public User updateUser(User formUser) throws Exception;
	
	public void deleteUser(Long id) throws Exception;

}
