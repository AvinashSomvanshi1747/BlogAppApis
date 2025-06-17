package com.codewithavinash.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UserDto 
{
	private int id;
	@NotEmpty
	@Size(min=4,message = "Username must be min of 4 charactor !!")
	private String name;
	@Email(message = "Email address is not valid !!")
	private String email;
	@NotEmpty
	@Size(min = 3,max = 10,message = "Password must be min 3 char and max of 10 char !!")
	private String password;
	@NotEmpty
	private String about;
	
}
