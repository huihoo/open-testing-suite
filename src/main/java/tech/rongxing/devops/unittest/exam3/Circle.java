package tech.rongxing.devops.unittest.exam3;

public class Circle {
	double pai = Math.PI;
	double r;
	double currentArea;
	
	public double area(double r ){
		this.r = r; 
		currentArea = pai * r * r;
		return currentArea;	
		
	}

}
