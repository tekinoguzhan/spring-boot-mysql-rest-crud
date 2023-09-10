package com.otekin.dev.demo.springbootmysqlrestcrud.repository;

import org.springframework.data.repository.CrudRepository;
import com.otekin.dev.demo.springbootmysqlrestcrud.entity.User;

public interface UserRepository 
   extends CrudRepository<User, Long> {

}
