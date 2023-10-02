package com.kn.arithmaticOPeration;

import java.util.Scanner;

public class ArithmaticOperations {


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the num1=");
		int num1 = scan.nextInt();
		
		System.out.println("Enter the num2=");
		int num2 = scan.nextInt();
		
		//Crate the methods using these names
		int sub = substractNumbers(20,5);
		int mul = multiplyNumbers(4,5);
		double div = divideNumbers(20,4);
		int rem = findRemainder(10,3);
		
		//Print the results according the operations
		System.out.println("The substraction of two numbers is="+sub);
		System.out.println("The multiplication of two numbers is="+mul);
		System.out.println("The division of two numbers is="+div);
		System.out.println("The remainder of two numbers is="+rem);
		
	}

	public static int findRemainder(int i, int j) {
		
		return (i%j);
	}

	public static double divideNumbers(int i, int j) {
		
		return (i/j);
	}

	private static int multiplyNumbers(int i, int j) {

		return (i*j);
	}

	private static int substractNumbers(int i, int j) {
		return (i-j);
	} 

}
