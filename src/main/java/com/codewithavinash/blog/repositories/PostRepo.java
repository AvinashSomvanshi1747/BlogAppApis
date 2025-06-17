package com.codewithavinash.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithavinash.blog.entities.Category;
import com.codewithavinash.blog.entities.Post;
import com.codewithavinash.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>
{
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
}
