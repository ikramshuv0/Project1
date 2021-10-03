package classNobjectNconstructors;

public class House {
	public static void main(String[] args) {
//		golobal variable belongs to the class
		String address;
		String color;
//		constructors
		public House(String myAddress, String myColor);
//		methods
//		local variable belong to the method
		public void details (String myAddress, String myColor){
			this.address = myAddress;
			this.color = myColor;

			System.out.println("the address of this house is: " + myAddress);
			System.out.println("the color of this house is: " + myColor);
		}

		public void kitchen () {
			System.out.println("let's cook");

		}
		public void bathroom () {
			System.out.println("shower... shower... shower");

		}

		public void livingroom () {
			System.out.println("let's watch TV");
		}

		public void masterBedroom () {
			System.out.println("mummy & daddy");
		}

		public void childrenroom () {
		}

		public void guesthouse () {
		}

		public void garage () {
		}

	}
}
	
	


