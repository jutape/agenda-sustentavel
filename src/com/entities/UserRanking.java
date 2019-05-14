package com.entities;

public class UserRanking {
	private double score = 0;
	private String tier = "SEED";
	
	private void setTier() {
		if(score < 150) {
			tier = "SEED";
		}else if(score <= 350) {
			tier = "PRIMARY GROWTH";
		}else if(score <= 550) {
			tier = "SECONDARY GROWTH";
		}else {
			tier = "MATURITY";
		}
	}
	
	public void addScore(double score) {
		this.score += score;
		setTier();
		
	}
	
	public String getTier() {
		return tier;
	}
}
