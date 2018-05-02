package cn.swust.software.unittest.exam4;

public class Example4 {
	Remainder1 remainder1 = new Remainder1();
	Remainder2 remainder2 = new Remainder2();
	Remainder3 remainder3 = new Remainder3();
	Remainder4 remainder4 = new Remainder4();
	Divisible divisible = new Divisible();
	int A1 = 0, A2 = 0, A3 = 0, A5 = 0;
	double  A4 = 0; 
	
	public  void fun(int[] number) { 
		for (int i = 0; i < number.length; i++) {
			A1 = divisible.total(divisible.judge(number[i]));
			A2 = remainder1.total(remainder1.judge(number[i]));
			A3 = remainder2.judge(number[i]);
			A4 = remainder3.average(remainder3.total(remainder3.judge(number[i])));
			A5 = remainder4.max(remainder4.judge(number[i]));
		} 
	} 
}
