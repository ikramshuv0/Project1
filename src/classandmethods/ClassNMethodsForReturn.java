package classandmethods;

public class ClassNMethodsForReturn {
//	Return Method
	public static int addition(int a, int b) {
		int total = a+b;
		return total;
		}
		public static int Substraction(int a, int b) {
		return a-b;
		}
		public static int Multiplication(int a, int b) {
			return a*b;
			}
		public static int Division(int a, int b) {
			return a/b;
		}
	
	public static void main(String[] args) { 
	System.out.println(addition(30, 30));
	System.out.println(Substraction(15, 65));
	System.out.println(Multiplication(15, 2));
	System.out.println(Division(15, 30));
	}

	
}
