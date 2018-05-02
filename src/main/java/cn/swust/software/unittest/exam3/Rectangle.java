package cn.swust.software.unittest.exam3;

public class Rectangle {
	int height;
	int width;
	double currentArea;
	
	public double area(int height, int width){
		this.height = height;
		this.width = width;
		currentArea = height * width;
		return currentArea;	
		
	}

}
