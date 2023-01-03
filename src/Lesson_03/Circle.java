package Lesson_03;

public class Circle {
	
	private double radius = 4.2;
	private double diameter = 5.6;
	
	public void getCircleArea() {
		double area = 3.14 * diameter;
		System.out.println(area);
	}
	
	public void getCircleLength() {
		double length = 3.14 * (radius * 2);
		System.out.println(length);
	}
}
