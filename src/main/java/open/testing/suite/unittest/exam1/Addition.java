package open.testing.suite.unittest.exam1;

public class Addition {
	double currentSum = 0;

	public double add(double figure) {
		currentSum += figure;
		return currentSum;
	}
	public double getSum()
	{
		return currentSum;
	}
}
