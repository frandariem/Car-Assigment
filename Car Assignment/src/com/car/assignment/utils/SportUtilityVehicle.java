package com.car.assignment.utils;

import com.car.assignment.main.Car;

public class SportUtilityVehicle extends Car {

	public SportUtilityVehicle(Integer year, String make, String model) {
		super(year, make, model);
	}

	@Override
	public boolean canCarry(Load load) {
		if (load.getWeight() > 200)
			return false;
		else
			return true;
	}

}
