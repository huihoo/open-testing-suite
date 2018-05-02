package cn.swust.software.unittest.demo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AddFunTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testAddThree_stub() {
		AddFun testObject = new AddFun(){
			public int addTwo(int a, int b)
			{
				return 110;
			}
		};
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		int act = testObject.addThree(a, b, c);
		Assert.assertEquals(exp, act);
	
	}
	
	@Test
	public void testAddThree() {
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		 
		AddFun testObject2 = new AddFun();
		int act2 = testObject2.addThree(a, b, c);
		Assert.assertEquals(exp, act2);
	}

}
