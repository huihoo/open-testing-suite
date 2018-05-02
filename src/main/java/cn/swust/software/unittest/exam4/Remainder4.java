package cn.swust.software.unittest.exam4;

public class Remainder4 {
	int count = 0;

	public int judge(int parameter) {
		if (parameter % 5 == 4)
			return parameter;
		else
			return 0;
	}

	public int max(int number) {
		if (count < number)
			count = number;
		return count;
	}
}
