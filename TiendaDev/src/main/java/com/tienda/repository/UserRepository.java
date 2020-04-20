package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
	

}
