package com.balram.user.service.UserService.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.balram.user.service.UserService.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{

}
