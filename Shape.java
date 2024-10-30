/*Create an abstract class 'Shape' with an abstract method 'calculateArea()'. 
Derive two classes 'Circle' and 'Rectangle' from 'Shape', implementing the 'calculateArea()'
 method for each shape. Write a program to calculate and display the area of each shape
 by instantiating objects of 'Circle' and 'Rectangle'*/

abstract class Shape{
	public abstract double CalculateArea();
}

class Circle extends Shape{
	double radius;
	public Circle(double radius){
		this.radius=radius;
	}
	public double CalculateArea(){
		return Math.PI*radius*radius;
	}
	public void display(){
		System.out.println("the area of the circle is:"+CalculateArea());
	}
}

class Rectangle extends Shape{
	double length;
	double width;
	public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
	public double CalculateArea(){
		return length*width;
	}
	public void display(){
		System.out.println("the area of the rectangle is:"+CalculateArea());
	}
}

class Area{
	public static void main(String[]args){
		Circle circle = new Circle(4.3);
		circle.display();
		Rectangle rectangle = new Rectangle(3.4,2.6);
		rectangle.display();
	}
}

	
		
		
		
	
	
	
