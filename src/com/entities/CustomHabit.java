package com.entities;


public class CustomHabit extends Habit{
	
	private String description;
	
	@Override
	public int getPoints() {
		return 100;
	}
	
	public CustomHabit (String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public void changeName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
}
