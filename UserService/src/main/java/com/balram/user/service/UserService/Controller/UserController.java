package com.balram.user.service.UserService.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.balram.user.service.UserService.Service.UserService;
import com.balram.user.service.UserService.model.User;

@RestController
@RequestMapping("/users")
@CrossOrigin
public class UserController {
	@Autowired
    private UserService userservice;
	
	
	@PostMapping
	public ResponseEntity<User> saveUser(@RequestBody User user){
		return ResponseEntity.status(HttpStatus.CREATED).body(userservice.saveUser(user));
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable Integer userId){
		return ResponseEntity.status(HttpStatus.OK).body(userservice.getUser(userId));
	}

	@GetMapping
	public ResponseEntity<List<User>> getallUser(){
		List<User> alluser =userservice.getAllUser();
		return ResponseEntity.ok(alluser);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<Void> deletebyid(@PathVariable Integer userId) {
		userservice.deletebyid(userId);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> put(@RequestBody User user , @PathVariable Integer userId){
		userservice.deletebyid(userId);
		return ResponseEntity.status(HttpStatus.CREATED).body(userservice.saveUser(user));
	}

}
