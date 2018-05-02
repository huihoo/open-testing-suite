package cn.swust.software.whitebox;

import java.util.Arrays;
import java.util.Collection; 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters; 
import junit.framework.Assert; 

@RunWith(Parameterized.class)
public class Exam1Test  {
	
	int testA; 
	int testB; 
	int testC;
	int testExp;
	
	public Exam1Test(int a, int b, int c, int exp)
	{
		testA = a;
		testB = b;
		testC = c;
		testExp = exp;
	}
	
	@Parameters    
	public static Collection data(){
	        return Arrays.asList(new Object[][]{
	                {2, 4, 4, 4},
	                {0, 4,5, 4},
	                {-3, 9,5, 4},
	        });
	}
	private double DELTA = 1e-15;
	Exam1 testObject; 
	@Before
    public void setUp()  {
		testObject = new Exam1();
	}
	@Test
	public void testFun1() {  
		int actx = testObject.fun1(testA, testB,  testC); 
		Assert.assertEquals(actx, testExp);
	}
	
	//@Test
	public void testDoWork() { 
		int a, b, x;
		a = 2; 
		b = 0;
		x = 3;
		double actx = testObject.DoWork(a, b, x);
		int expx = 2;
		Assert.assertEquals(expx, actx, DELTA);
	}
 
}
