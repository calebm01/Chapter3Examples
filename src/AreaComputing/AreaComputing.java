package AreaComputing;

import java.util.Scanner;
/*
 * Caleb Mouritsen
 * 9/12/18
 * compute the area of a circle
 * added this code into git
 */

public class AreaComputing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// step one: enter the radius of a circle
			double radius; 
			double pi; 
			double area;
			
			//assign some values
			System.out.println("Enter a radius: ");
			radius = input.nextDouble();
			pi = 3.14159;
		// step two: compute the area using the following formula 
		// area = radius*radius*pi
		area = radius*radius*pi;
		
		//step three: display result
		System.out.println("the area of the circle is: " + area);
	}

}
