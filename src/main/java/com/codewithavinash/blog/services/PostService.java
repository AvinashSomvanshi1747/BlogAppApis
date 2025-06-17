package com.codewithavinash.blog.services;

import java.util.List;

import com.codewithavinash.blog.entities.Post;
import com.codewithavinash.blog.payloads.PostDto;

public interface PostService 
{
	// Create New Post
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	// Update the Post
	Post updatePost(PostDto postDto,Integer postId);
	// Delete the Post
	void deletePost(Integer postId);
	// Get all Posts
	List<Post> getAllPost();
	// Get Single Posts
	Post getPostById(Integer postId);
	// Get all posts by Category
	List<Post> getPostsByCategory(Integer categoryId);
	// Get all Post by User
	List<Post> getPostByUser(Integer userId);
	// Search Post
	List<Post> searchPost(String keyword);
	
}
