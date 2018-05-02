package cn.swust.software.unittest.exam4;

public class Remainder2 {
	int count = 0;

	public int judge(int parameter) {
		if (parameter % 5 == 2)
			count++;
		return count;
	}
}
