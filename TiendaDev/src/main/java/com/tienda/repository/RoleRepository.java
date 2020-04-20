package com.tienda.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tienda.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long>{

}
