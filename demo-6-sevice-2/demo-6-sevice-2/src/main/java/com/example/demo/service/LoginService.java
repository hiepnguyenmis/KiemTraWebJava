package com.example.demo.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;


import com.example.demo.model.User;

public interface LoginService extends JpaRepository<User, Long>{
	//get User
	public default List<User> GetAllUsers(){
		return this.findAll();
	}
	//get 1 user
	public default User GetOnetUser(long id) {
		return this.getOne( id);
	}
	//add 
	public default boolean InsertUser(User user) {
		if(user!=null) {
			this.save(user);
			return true;
		}
		return false;
	}
	
//	update
	public default boolean UpdateUser(User user) {
		User userid=this.getOne(user.getId());
		if(userid!=null) {
			userid.setPassword(user.getPassword());
			userid.setUsername(user.getUsername());
			this.save(user);
			return true;
		}
		return false;
	}
	
//delete
	public default boolean DeleteUser(long id) {
		User userid=this.getOne(id);
		if(userid!=null) {
			this.delete(userid);
			return true;
		}
		return false;
	}
}
