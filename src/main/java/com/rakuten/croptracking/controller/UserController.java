package com.rakuten.croptracking.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakuten.croptracking.DAO.UserService;
import com.rakuten.croptracking.models.Role;
import com.rakuten.croptracking.models.User;
import com.rakuten.croptracking.models.UserRole;

@RequestMapping("/user")
@RestController
@CrossOrigin("*")
public class UserController {
	
	@Autowired
	private UserService userdao;
	
	@Autowired 
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@PostMapping("/")
	public User createUser(@RequestBody User user) throws Exception {
		
		user.setPassword(this.bCryptPasswordEncoder.encode(user.getPassword()));
		Set<UserRole> roles= new HashSet<>();
		Role role = new Role();
        role.setRoleId(45L);
        role.setRoleName("NORMAL");

        UserRole userRole = new UserRole();
        userRole.setUser(user);
        userRole.setRole(role);

        roles.add(userRole);
	return this.userdao.createUser(user, roles);
	
	}
	
	@GetMapping("/{username}")
	public User getUser(@PathVariable("username") String username) {
		return this.userdao.getUser(username);

    }

	@GetMapping("/")
	public ResponseEntity<?> User()
	{
		return ResponseEntity.ok(this.userdao.getUser());
	}
	
	@DeleteMapping("/{userId}")
	public void deleteUser(@PathVariable("userId") Long userId)
	{
		this.userdao.deleteUser(userId);
	}

	@PutMapping("/")
	public ResponseEntity<User> update(@RequestBody User user)
	{
		return ResponseEntity.ok(this.userdao.updateUser(user));
	}
	@GetMapping("/allusers")
	public List<User> listUsers(Model model) {
	    List<User> listUsers = userdao.findAll();
	    model.addAttribute("listUsers", listUsers);
	     
	    return listUsers;
	}
	
	
}
