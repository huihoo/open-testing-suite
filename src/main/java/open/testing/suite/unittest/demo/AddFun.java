package open.testing.suite.unittest.demo;

public class AddFun {

	public int addThree(int a, int b, int c) {
		return addTwo(a, b) + c;
	}

	public int addTwo(int a, int b) {
		return a - b;
	}

}
