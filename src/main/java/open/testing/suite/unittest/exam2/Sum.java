package open.testing.suite.unittest.exam2;

public class Sum {
	public double currrentSum = 0;

	public double totalSum(int parameter) {
		currrentSum = 0;
		for (int i = 0; i < parameter; i++) {
			currrentSum += i;
		}
		return currrentSum;
	}
}
