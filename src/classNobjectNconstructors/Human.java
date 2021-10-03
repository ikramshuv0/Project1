package classNobjectNconstructors;

public class Human {
	int height; // non static variable
	static int width = 10; // static variable; static keyword; it will be always before the type of variable
	int depth = 5; // non-static variable
	
//	non-static method
	public void smile() {
		height = 15; //accessing nonstatic variable from non-static variable is fine
		width = 15; //accessing static variable from non-static variable is fine too
		System.out.println("human can smile");
	}
	
//	static method
	public static void cry() {
		width = 15; //accessing static variable from static method is fine again
		//height = 15; // But, accessing non static variable from static method is not fine
		System.out.println("human can cry");
		
		//static method can only use static variables
		// non static method can use all type of variables
	
	}
}
