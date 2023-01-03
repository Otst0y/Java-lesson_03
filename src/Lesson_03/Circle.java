package Lesson_03;

public class Circle {
	
	private double radius;
	private double diameter;
	
	Circle(double radius, double diameter){
		this.radius = radius;
		this.diameter = diameter;
	}
	
	
	public void getCircleArea() {
		double area = 3.14 * diameter;
		System.out.println(area);
	}
	
	public void getCircleLength() {
		double length = 3.14 * (radius * 2);
		System.out.println(length);
	}
}
