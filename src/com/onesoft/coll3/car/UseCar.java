package com.onesoft.coll3.car;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

//brand, price, model, color
public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car("Hyndai", 2500000, "tucson", "RED");
		Car car2 = new Car("Audi", 5500000, "X6", "BLACK");
		Car car3 = new Car("JAGUAR", 5000000, "BEAST", "WHITE");
		Car car4 = new Car("BMW", 4500000, "A3", "MATBLAK");
		Car car5 = new Car("MARURHI", 1500000, "SWIFT", "WHITE");
		Car car6 = new Car("RENOLD", 700000, "DUSTOR", "GREEN");
		Car car7 = new Car("NISSON", 1500000, "SUNNY", "BLACK");
		Car car8 = new Car("MORRIES GARRIEGE", 4575000, "BROAD", "RED");
		Car car9 = new Car("ROLES ROYCE", 10000000, "CULLINUN", "BLACK");
		Car car10 = new Car("BUCATI", 7500000, "SPEED", "ORANGE");
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		cars.add(car8);
		cars.add(car9);
		cars.add(car10);
		List<Car> redCars = cars.stream().filter(car -> car.getColor().equalsIgnoreCase("red"))
				.collect(Collectors.toList());
		List<Car> expensiveCars = cars.stream().filter(car -> car.getPrice() >= 3000000).collect(Collectors.toList());
		redCars.forEach(car -> System.out.println(car));
		System.out.println("      - - - - - - - - - - - - - - ");
		expensiveCars.forEach(car -> System.out.println(car));
	}

}
