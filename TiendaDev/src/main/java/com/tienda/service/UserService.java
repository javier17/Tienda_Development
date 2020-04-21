package com.tienda.service;

import javax.validation.Valid;

import com.tienda.model.User;

public interface UserService {

	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;

}
