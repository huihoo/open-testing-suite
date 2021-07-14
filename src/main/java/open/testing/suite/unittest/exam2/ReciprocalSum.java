package open.testing.suite.unittest.exam2;

public class ReciprocalSum {
	double currentSum = 0;

	public double reciprocal(int paramter) {
		currentSum = 0;
		for (int i = 1; i < paramter; i++) {
			currentSum += ((double) 1) / i;
		}
		return currentSum;
	}
}
