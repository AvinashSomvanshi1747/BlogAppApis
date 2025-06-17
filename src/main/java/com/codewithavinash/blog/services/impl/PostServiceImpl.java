package com.codewithavinash.blog.services.impl;

import java.security.PrivateKey;
import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithavinash.blog.entities.Category;
import com.codewithavinash.blog.entities.Post;
import com.codewithavinash.blog.entities.User;
import com.codewithavinash.blog.exceptions.ResourceNotFoundException;
import com.codewithavinash.blog.payloads.PostDto;
import com.codewithavinash.blog.repositories.CategoryRepo;
import com.codewithavinash.blog.repositories.PostRepo;
import com.codewithavinash.blog.repositories.UserRepo;
import com.codewithavinash.blog.services.PostService;


@Service
public class PostServiceImpl implements PostService
{
	@Autowired
	private PostRepo postRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public PostDto createPost(PostDto postDto,Integer userId,Integer categoryId) 
	{
		User user = this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("Üser","userId", userId));
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","categoryId", categoryId));
		Post post = this.modelMapper.map(postDto, Post.class);
		post.setImageName("default.png");
		post.setAddedDate(new Date());
		post.setUser(user);
		post.setCategory(category);
		Post newPost = this.postRepo.save(post);
		return this.modelMapper.map(newPost,PostDto.class);
	}

	@Override
	public Post updatePost(PostDto postDto, Integer postId) 
	{
		
		return null;
	}

	@Override
	public void deletePost(Integer postId) 
	{
		
		
	}

	@Override
	public List<Post> getAllPost() {
		
		return null;
	}

	@Override
	public Post getPostById(Integer postId) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByCategory(Integer categoryId) 
	{
		
		return null;
	}

	@Override
	public List<Post> getPostByUser(Integer userId) 
	{
		
		return null;
	}

	@Override
	public List<Post> searchPost(String keyword) 
	{
		
		return null;
	}

}
