package oop.polymorphism;
public class LandCalculator {
	
//	Overloading: when we use the same method with same name but different parameters
	public int AreaOfLand(int a, int b) {
		int total = a+b;
		return total;
	}
	
	public int AreaOfLand(int a, int b, int c) {
		int total = a+b+c;
		return total;
	}
	
	public int AreaOfLand(int a, int b, int c, String str){ {
		int total = a+b+c;
		System.out.println(str);
		return total;
	}
	
	}
}