package com.kn.finane;

import java.util.Scanner;

public class Finance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take the user input
		System.out.println("Enter the principal=");
		double principal = scan.nextDouble();
		
		System.out.println("Enter the rate=");
		double rate = scan.nextDouble();
		
		System.out.println("Enter the time=");
		double time = scan.nextDouble();
		
		
		//Create the object of class FinanceCalculator
		FinanceCalculator calculator = new FinanceCalculator();
		
		//call the function of class calculateSimpleInterest
		double result =calculator.calculateSimpleInterest(principal, rate, time);
		
		//Print the result
		System.out.println("The simple interest is="+result);
		
	}

}
