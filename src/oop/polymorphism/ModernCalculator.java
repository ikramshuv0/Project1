package oop.polymorphism;

public class ModernCalculator {
//	Override: it needs annotation and inheritance both. we need it when we use the same method name and same parameters but with a different body
//	NB: it will be extended to the original class where the method is located
	@Override
	public int AreaOfLand(int a, int b) {
		int total = a+b+10;
		return total;
		
		ModernCalculator mc = new ModernCalculator();
		System.out.println(mc.AreaOfLand(5, 10));

	}

	

}
