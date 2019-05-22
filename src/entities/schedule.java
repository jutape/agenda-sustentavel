package com.entities;

import java.util.ArrayList;
import java.util.Date;

public class Schedule {
	private Date period;
	private ArrayList<Habit> atividades = new ArrayList();
	
	
	public void setPeriod(Date period) {
		clearSchedule();
		this.period = period;
	}
	
	public void addActivity(Habit atividade) {
		this.atividades.add(atividade);
	}
	
	public void removeActivity(Habit atividade) {
		this.atividades.remove(atividade);
	}
	
	private void clearSchedule() {
		this.period = null;
		this.atividades.clear();
	}
}
