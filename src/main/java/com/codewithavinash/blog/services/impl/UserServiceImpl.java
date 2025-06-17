package com.codewithavinash.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithavinash.blog.entities.User;
import com.codewithavinash.blog.exceptions.ResourceNotFoundException;
import com.codewithavinash.blog.payloads.UserDto;
import com.codewithavinash.blog.repositories.UserRepo;
import com.codewithavinash.blog.services.UserService;

import jakarta.validation.Valid;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
    private UserRepo userRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser( UserDto userDto) 
	{
		User user = this.dtoToUser(userDto);
		User savedUser = this.userRepo.save(user);	
		return this.userToDto(savedUser);
	}

	@Override
	public UserDto updateUser( UserDto userDto, Integer userId) 
	{  
	   User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id",userId));
	
	   user.setName(userDto.getName());
	   user.setEmail(userDto.getEmail());
	   user.setPassword(userDto.getPassword());
	   user.setAbout(userDto.getAbout());
	   
	  User updateUser = this.userRepo.save(user);
	  UserDto userDto1 = this.userToDto(updateUser);
	  
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) 
	{
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id", userId));
		
		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() 
	{
		List<User> users = this.userRepo.findAll();
	    List<UserDto> userDtos = users.stream().map(user-> this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) 
	{
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","Id", userId));
	   this.userRepo.delete(user);
	}
	
	private User dtoToUser(UserDto userDto)
	{
		// below is used the modelmapper for the conversion the one object to other object
		User user = modelMapper.map(userDto,User.class);
		
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
//		user.setAbout(userDto.getAbout());
		return user;
	}
	private UserDto userToDto(User user) 
	{
		UserDto userDto = modelMapper.map(user, UserDto.class);
		
		return userDto;
	
	}

}
