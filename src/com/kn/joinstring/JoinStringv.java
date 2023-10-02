package com.kn.joinstring;

import java.util.Scanner;

public class JoinStringv {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the str1");
		String str1 = scan.next();
		
		System.out.println("Enter the second char1");
		String str2 = scan.next();
		
		
		Join j1 = new Join();
		
		//call the function of class joinString
		j1.joinStrings(str1,str2);
		
		//System.out.println("The joined string"+);
		
		
		
	}

}
