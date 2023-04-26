package com.spring.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.java.model.Role;
import com.spring.java.model.Users;
import com.spring.java.repository.UsersRepository;
import com.spring.java.repository.*;

@RestController
@RequestMapping("/home")
public class ManyToManyController 
{
	@Autowired
	UsersRepository usersRepo;
	
	@Autowired
	RoleRepository roleRepo;
	
	
	@PostMapping("/user-post")
	public Users insertUser(@RequestBody Users users)
	{
		return usersRepo.save(users);
	}
	
	@PostMapping("/role-post")
	public Role insertRole(@RequestBody Role role)
	{
		return roleRepo.save(role);
	}
	
	@GetMapping("/getUsers")
	public String getAllUsers() 
	{
		return "All Datas Were..!! "+usersRepo.findAll();
	}
	
}
