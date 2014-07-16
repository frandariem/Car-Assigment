package com.car.assignment.main;

import com.car.assignment.utils.Load;

public class Main {
	
	public static void main(String[] args) {
		
		for(int k = 0; k != 10; k++) {
			Load load = new Load((int) (Math.random() * 400 + 1));
			
			CarDealer carDealer = new CarDealer();
			carDealer.getSmallestCarThatCanCarry(load);
		}
		
	}

}
