package cn.swust.software.unittest.exam4;

public class Remainder3 {
	int count = 0;
	float num;
	int figure = 0;

	public int judge(int parameter) {
		if (parameter % 5 == 3) {
			figure++;
			return parameter;
		} else
			return 0;
	}

	public int total(int number) {
		count += number;
		return count;
	}

	public float average(int sum) {
		num = (float) sum / figure;
		String result = String.format("%.1f", num).toString();
		return Float.parseFloat(result);
	}
}
