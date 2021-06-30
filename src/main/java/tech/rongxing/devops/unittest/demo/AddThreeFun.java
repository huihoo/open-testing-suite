package tech.rongxing.devops.unittest.demo;

public class AddThreeFun {
	
	AddTwoFun addTwo = new AddTwoFun();
	
	public int add(int a, 
			int b, int c)
	{
		return c + addTwo.add(a, b);
	}

}
