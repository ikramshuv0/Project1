package classandmethods;

public class UseAddition {
	public static void main(String[] args) {
//		create an object for Non-Return
	ClassNMethodsForNR object1 = new ClassNMethodsForNR();
		object1.addition2(50, 100);
		object1.Substraction(30,15);
		object1.Division(3, 15);
		object1.Multiplication(30, 30);
		
//		create an object for Return
	ClassNMethodsForReturn object2 = new ClassNMethodsForReturn();
	object2.addition(50, 50);
	
	}
}

