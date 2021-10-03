package oop.abstruction;

public class Honda implements Car, Motor{

//	these methods are coming from car interface
	public void carShape() {
		System.out.println("Aerodynamic with 2 people capacity");
		
	}

	public void start() {
		System.out.println("let's Drive");
		
	}

	public void stop() {
		System.out.println("Need Brakes");
		
	}
	public void changegear() {
		System.out.println("3 Manual shift");
		
	}
//	this is a Honda class Method
	
	public void radio() {
		System.out.println("let's play music");
	}

//this methods are coming from Motor
	public void engine() {
		System.out.println("Engine with Turbo");
		
	}


	public void fuelType() {
		System.out.println("Diesel Fuel type");
		
	}

	
	public void changgear() {
		
		
	}

}
