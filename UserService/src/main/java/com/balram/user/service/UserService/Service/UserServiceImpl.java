package com.balram.user.service.UserService.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.balram.user.service.UserService.Dao.UserRepository;
import com.balram.user.service.UserService.exceptions.ResourceNotFound;
import com.balram.user.service.UserService.model.User;

import jakarta.transaction.Transactional;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	public UserRepository userrepository;
	
	@Override
	@Transactional
	public User saveUser(User user) {
		
		return userrepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}

	@Override
	public User getUser(Integer userId) {
		// TODO Auto-generated method stub
		return userrepository.findById(userId).orElseThrow(()-> new ResourceNotFound("User with gievn id is not found on server  "+userId));
	}

	@Override
	@Transactional
	public void deletebyid(Integer userId) {
		// TODO Auto-generated method stub
		
		userrepository.deleteById(userId);
		
	}

	
}
