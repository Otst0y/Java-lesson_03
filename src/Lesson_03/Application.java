package Lesson_03;

public class Application {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(4, 6);
		
		Circle c1 = new Circle();
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println();
		
		r2.getArea();
		r2.getPerimeter();
		System.out.println();
		
		r1.getArea();
		r1.getPerimeter();
		System.out.println();
		
		c1.getCircleArea();
		c1.getCircleLength();
		
		
	}

}
