package com.entities;

import java.util.Date;

public abstract class Habit {
	private String name;
	private Date period;
	public Status status = Status.waiting;
}
