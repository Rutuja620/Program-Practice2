package com.kn.DoubleTrouble;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Take the input from user
		System.out.println("Enter the num1=");
		int num = scan.nextInt();
		
		//Create the method
		int  doubleTheNumber = doubleTheNumber( num);
		
		//Print the number
		System.out.println("The num is "+doubleTheNumber);
	}

	public static int doubleTheNumber(int num) {
		
		return num*2;
	}

}
