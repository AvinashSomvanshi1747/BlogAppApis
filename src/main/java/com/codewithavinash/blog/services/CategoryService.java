package com.codewithavinash.blog.services;

import java.util.List;


import com.codewithavinash.blog.payloads.CategoryDto;


public interface CategoryService 
{
	//Create
	CategoryDto createCategory(CategoryDto categoryDto);
	//Update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	//Delete
	void deleteCategory(Integer categoryId);
	//Get Single Category
	CategoryDto getCategory(Integer categoryId);
	//Get All Category
	List<CategoryDto> getCategories();
	
}
