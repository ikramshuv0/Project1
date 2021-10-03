package oop.abstruction;

public class TestCar {

	public static void main(String[] args) {
//		this method belongs to Honda, not Car so we cannot add/implement radio there.
		Car crv = new Honda();
		crv.carShape();
		crv.changgear();
		crv.start();
		crv.stop();

		System.out.println("------------------");
		
		Honda Civic = new Honda();
		Civic.carShape();
		Civic.start();
		Civic.stop();
		Civic.changegear();
		Civic.radio();
		Civic.fuelType();
		Civic.engine();
		

	}

}
