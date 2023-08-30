package com.shop.authentication.repository;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shop.authentication.models.ERole;
import com.shop.authentication.models.Role;



public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
} 