package com.car.assignment.utils;

import com.car.assignment.main.Car;

public class Compact extends Car {

	public Compact(Integer year, String make, String model) {
		super(year, make, model);
	}


	@Override
	public boolean canCarry(Load load) {
		if (load.getWeight() > 100)
			return false;
		else
			return true;
	}

}
