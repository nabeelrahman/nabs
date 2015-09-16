package edu.univeristy.dataStructures.Chapter8;

import java.io.*;
import java.util.Scanner;

class Rectangle1 {

	private double length, width;

	public Rectangle1() {

		// Setting up default values for length and width
		setLength(1.0);
		setWidth(1.0);
	}

	// constructor with length and width supplied
	public Rectangle1(double theLength, double theWidth) {
		setLength(theLength);
		setWidth(theWidth);

	}

	// validate and set length
	public void setLength(double theLength) {
		length = (theLength > 0.0 && theLength < 20.0 ? theLength : 1.0);

	}

	public void setWidth(double theWidth) {
		width = (theWidth > 0.0 && theWidth < 20.0 ? theWidth : 1.0);

	}

	public double perimeter() {
		return (2 * length + 2 * width);
	}

	public double area() {
		return length * width;
	}

	public String toRectangleString() {

		return ("Length: " + length + "\n" + "Width: " + width + "\n" + "Perimeter" + perimeter() + "\n" + "Area is: "
				+ area() + "\n"

		);
	}

}// End class rectangle

public class TestRectangleNew {
	public static void main(String args[]) {
		
		Rectangle1 rect1 = new Rectangle1();
		double length, width;
		
		Scanner input = new Scanner(System.in);
		//inputting length
		System.out.println("Enter the length of the rectangle");
		length = input.nextDouble();
		System.out.println("Enter the Width of the rectangle");
		width = input.nextDouble();
		
		//function calls for setting values
		rect1.setLength(length);
		rect1.setWidth(width);
		System.out.println(rect1.toRectangleString());
		//Exit program
		//System.exit(0);
		
		Rectangle1 rect2 = new Rectangle1(5,5);
		System.out.println(rect1.toRectangleString());
		
		

	}
}
