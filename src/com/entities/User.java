package com.entities;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String name;
	private String img;
	private String email;
	private String pswd;
	private List<User> friends = new ArrayList<>();
	private Schedule schedule = new Schedule();
	private UserRanking ranking = new UserRanking();
	
	public User(String name, String email, String pswd){
		this.name = name;
		this.email = email;
		this.pswd = pswd;
	}
	
	public void setImage(String img) {
		this.img = img;
	}
	
	public void addFriend(User user) {
		this.friends.add(user);
	}
	
	public void deleteFriend(User user) {
		this.friends.remove(user);
	}
}