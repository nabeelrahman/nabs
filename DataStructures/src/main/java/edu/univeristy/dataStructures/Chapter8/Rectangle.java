package edu.univeristy.dataStructures.Chapter8;

public class Rectangle {
	
	float length;
	float width;

	public Rectangle(float length, float width) {
		// TODO Auto-generated constructor stub
		//test
		this.length = length;
		this.width = width;
	}
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
		this.setWidth(width);
		this.setLength(length);
	}

	//validate and set length
	public void setLength(float length){
		
		if (length < 0.0 || length > 20.0)
			throw new IllegalArgumentException("length must be between 0 through 20");
		this.length = length;
	}
	
	public void setWidth(float width) {
		//width = 1;
		if(width < 0.0 || width > 20.0)
			throw new IllegalArgumentException("Width must be 0 through 20");
	}
	
	public float getLength(){
		return length;
	}
	
	public float getWidth(){
		return width;
	}
	
	public float calculateArea(float length, float width){
		return length*width;
		
	}
	
	public float calculatePerimeter(float length, float width){
		return ((2*length) + (2*width));
	}

}
