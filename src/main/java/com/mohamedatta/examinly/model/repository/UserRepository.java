package com.mohamedatta.examinly.model.repository;

import org.springframework.data.repository.CrudRepository;

import com.mohamedatta.examinly.model.User;

public interface UserRepository extends CrudRepository<User, Long>{
User findByEmail(String email);
}
