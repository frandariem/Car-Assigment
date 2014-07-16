package com.car.assignment.utils;

public class Load {
	
	private Integer weight;
	
	public Load(Integer weight){
		this.weight = weight;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	@Override
	public final String toString() {
		return "Weight: " + this.weight.toString() + " Pounds";
		
	}

}
