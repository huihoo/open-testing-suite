package cn.swust.software.unittest.exam4;

public class Divisible {
	int count = 0;

	public int judge(int parameter) {
		if (parameter % 5 == 0 && parameter % 2 == 0)
			return parameter;
		else
			return 0;
	}

	public int total(int number) {
		count += number;
		return count;
	}

}
