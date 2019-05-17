package com.entities;

public abstract class Habit {
	protected String name;
	protected Status status = Status.waiting;
	protected int frequency;
	
	public abstract int getPoints();
	
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}
}
