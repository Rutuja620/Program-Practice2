package com.kn.arithmaticGalactic;

import java.util.Scanner;

public class GalacticArithmatic {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	//Take the user input
	System.out.println("Enter the num1=");
	long num1 = scan.nextLong();
	
	System.out.println("Enter the num2=");
	long num2 = scan.nextLong();
	
	//Create the method name as galactic
	
	long galactic = galacticAddition( num1,num2);
	
	//Print the output
	System.out.println(galactic);
	
}

	public static long galacticAddition(long num1, long num2) {
		long sum = num1+num2;
		return sum;
	}

}
