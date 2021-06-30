package tech.rongxing.devops.unittest.exam2;

public class OfsquaresSum {
	double currentSum = 0;

	public double squares(int parameter) {
		currentSum = 0;
		for (int i = 0; i < parameter; i++) {
			currentSum += i * i;
		}
		return currentSum;
	}
}
