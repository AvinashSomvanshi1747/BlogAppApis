package com.codewithavinash.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithavinash.blog.entities.Category;


public interface CategoryRepo extends JpaRepository<Category, Integer>
{
	
}
