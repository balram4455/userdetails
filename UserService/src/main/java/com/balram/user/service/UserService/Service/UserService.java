package com.balram.user.service.UserService.Service;

import java.util.List;


import com.balram.user.service.UserService.model.User;

public interface UserService{
	
	//create
	User saveUser(User user);
	
	//get all user
	List<User> getAllUser();
	
	//get single User of given userid
	
	

	User getUser(Integer userId);


	void deletebyid(Integer userId);

	
	
	//delete
	
	
	//update
	

}
