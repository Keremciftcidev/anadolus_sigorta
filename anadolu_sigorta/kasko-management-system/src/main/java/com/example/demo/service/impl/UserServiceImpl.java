package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.service.UserService;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepositoryy;


@Service 
public class UserServiceImpl implements UserService{
	
	private UserRepositoryy userRepository;
	
	public UserServiceImpl(UserRepositoryy userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
}
