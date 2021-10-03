package oop.inheritance;

public class TestHuman {

	public static void main (String[] args) {
		
		Father f = new Father();
		f.eyescolor();
		f.athletic();
		f.rich();
		System.out.println("---------------");
		Son s = new Son();
		s.eyescolor();
		s.athletic();
		s.rich();
		
	}
}
