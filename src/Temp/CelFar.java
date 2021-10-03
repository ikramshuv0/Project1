package Temp;

import java.util.Scanner;

public class CelFar {
	public static void main(String[] args){
		
		System.out.println("Please enter celsius... ");
		//scanner to take user input
		Scanner scr = new Scanner(System.in);
		//to take double number to convert
		double number = scr.nextDouble();
		double fah = 0.0;
		
		//formula to convert from celsius to fah
		fah=(number*1.8)+32;
		System.out.println("Value of the far is: "+fah);
		
	}
}