package tech.rongxing.devops.whitebox;

public class Exam1 {
	public int fun1(int a, int b, int x) {
		if ((a > 1) && (b == 0))
			x = x / a;

		if ((a == 2) || (x > 1))
			x = x + 1;
		return x;
	}
	
	double DoWork(int x, int y, int z) {
		double k = 0, j = 0;
		if ((x > 3) && (z < 10)) {
			k = x * y - 1;
			j = Math.sqrt(k);
		}
		if ((x == 4) || (y > 5))
			j = x * y + 10;
		j = j % 3;
		return j;
	}
}
