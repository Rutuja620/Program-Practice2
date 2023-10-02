package com.kn.methods;

import java.util.Scanner;

public class Explorer {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Take the user input
		System.out.println("Enter the radius ");
		double radius = scan.nextDouble();
		
		
		
		//create the object of class PlanetExplorer
		PlanetExplorer explorer = new PlanetExplorer();
		
		
		//call the function calculateSurfaceArea
		double res = explorer.calculateSurfaceArea(3.0);
		
		//Print the output
		System.out.println("The radius="+radius);
		System.out.println("The Area is="+res);
		
		
	}

}
