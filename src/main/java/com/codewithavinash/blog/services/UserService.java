package com.codewithavinash.blog.services;

import java.util.List;

import com.codewithavinash.blog.payloads.UserDto;

public interface UserService 
{
	UserDto createUser(UserDto user);
	UserDto updateUser(UserDto userDto,Integer userId);
	UserDto getUserById(Integer userId);
	List<UserDto>getAllUsers();
	void deleteUser(Integer userId);
	
	
}
