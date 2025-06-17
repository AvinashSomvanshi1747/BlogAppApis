package com.codewithavinash.blog.services;

import java.util.List;

import com.codewithavinash.blog.entities.Post;
import com.codewithavinash.blog.payloads.PostDto;

public interface PostService 
{
	// Create New Post
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	// Update the Post
	PostDto updatePost(PostDto postDto,Integer postId);
	// Delete the Post
	void deletePost(Integer postId);
	// Get all Posts
	List<PostDto> getAllPost();
	// Get Single Posts
	PostDto getPostById(Integer postId);
	// Get all posts by Category
	List<PostDto> getPostsByCategory(Integer categoryId);
	// Get all Post by User
	List<PostDto> getPostByUser(Integer userId);
	// Search Post
	List<Post> searchPost(String keyword);
	
}
