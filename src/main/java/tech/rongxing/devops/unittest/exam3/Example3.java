package tech.rongxing.devops.unittest.exam3;

public class Example3 {
	public Rectangle rect = new Rectangle();
	public Circle circle = new Circle();
	

	public double area(int width, int height){
		double area1 = rect.area(height, width);
		double area2 = circle.area(height/2.0);
		return area1 + area2;
	}
	}
