package Lesson_03;

public class Rectangle {
	
	//attributes
	private int width;
	private int length;
	
	//constructor with parameters
	Rectangle (){				
		this.width = 5;
		this.length = 3;
	}
	
	//constructor without parameters
	Rectangle (int width, int length){
		this.width = width;
		this.length = length;
	}
	
	//method for getting perimeter
	public void getPerimeter(){
		int perimeter = (width * 2) + (length * 2);
		System.out.println("Rectangle perimeter = " + perimeter);
	}
	
	//method for getting area
	public void getArea(){
		int area = width * length;
		System.out.println("Rectangle area = " + area);
	}
	
	public String toString(){
		return "Rectangle [width = " + width + ", length = " + length + "]";
	}
}
