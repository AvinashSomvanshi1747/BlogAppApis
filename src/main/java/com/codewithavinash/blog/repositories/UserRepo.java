package com.codewithavinash.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithavinash.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer>
{
	
}
