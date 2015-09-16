package edu.univeristy.dataStructures.Chapter8;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Rectangle rectangle = new Rectangle(5,5);
		//Is this initializing the constructor ?
		
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		rectangle.setLength(5);
		rectangle.setWidth(5);
		System.out.println(rectangle.calculateArea(5, 5));
		System.out.println(rectangle.calculatePerimeter(5,5));
		System.out.println(rectangle.getLength());
		System.out.println(rectangle.getWidth());
		
		
		rectangle.setLength(10);
		rectangle.setWidth(10);
		System.out.println(rectangle.calculateArea(10, 10));
		System.out.println(rectangle.calculatePerimeter(10, 10));
	}

}
