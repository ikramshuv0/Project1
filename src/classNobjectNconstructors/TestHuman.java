package classNobjectNconstructors;

public class TestHuman {

	public static void main(String[] args) {
		Human h = new Human();

    	System.out.println(h.width); 
		System.out.println(h.depth);
//		here width is Static and depth is non-static
		
		System.out.println(h.width);
//		static variables can be accessed by the class name
		
	}

}
