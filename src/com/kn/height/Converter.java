package com.kn.height;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the height in inches=");
		double inches = scan.nextDouble();
		
		
		//create the object of class HeightConverter
		HeightConverter converter = new HeightConverter();
		
		
		//call the function of class convertInches
		double result = converter.convertInchesToFeet(inches);
		
		//Print the result
		System.out.println("The inches is="+inches);
		System.out.println("converted to feet="+result);
		
	}

}
