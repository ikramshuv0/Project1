package classNobjectNconstructors;

public class TestHouse {
	public static void main(String[] args) {
//		
		House house1 = new House();
		house1.bathroom();
		house1.childrenroom();
		
		System.out.println("---------------------------");
		
		House house2 = new House();
		house2.bathroom();
		house2.kitchen();
		System.out.println("---------------------------");
		
		
		House house3 = new House();
		house3.masterBedroom();
		System.out.println("---------------------------");
	}

}
