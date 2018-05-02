package cn.swust.software.unittest.exam2;

public class Example2 {
	OfsquaresSum sumofsquares = new OfsquaresSum();
	ReciprocalSum reciprocalsum = new ReciprocalSum();
	Sum sum = new Sum();
	public double fun(int number, int figure, int fate) { 
		double allsum = sum.totalSum(number) + sumofsquares.squares(figure) 
		+ reciprocalsum.reciprocal(fate);
		return allsum;

	}

}
