package com.car.assignment.utils;

import com.car.assignment.main.Car;

public class PickupTruck extends Car {

	public PickupTruck(Integer year, String make, String model) {
		super(year, make, model);
	}

	@Override
	public boolean canCarry(Load load) {
		if (load.getWeight() > 400)
			return false;
		else
			return true;
	}

}
