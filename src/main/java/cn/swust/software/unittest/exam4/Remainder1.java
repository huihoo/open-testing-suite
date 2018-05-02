package cn.swust.software.unittest.exam4;

public class Remainder1 {
	int count = 0;
	int jmp = 0;

	public int judge(int parameter) {
		if (parameter % 5 == 1) {
			jmp++;
			if (jmp % 2 == 1)
				return parameter;
			else
				return 0 - parameter;
		} else
			return 0;
	}

	public int total(int number) {
		count += number;
		return count;
	}

}
