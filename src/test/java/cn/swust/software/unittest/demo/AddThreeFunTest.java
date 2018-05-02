package cn.swust.software.unittest.demo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class AddThreeFunTest {
	private double DELTA = 1e-15;

	@Before
	public void setUp() throws Exception {
		 
	}

	@Test
	public void testAdd_mock() {
		AddTwoFun mockTwo = mock(AddTwoFun.class);
		AddThreeFun testObj = new AddThreeFun();
		testObj.addTwo = mockTwo;
		
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		Mockito.when(mockTwo.add(50, 60)).thenReturn(110);
		int act = testObj.add(a, b, c);
		Assert.assertEquals(exp, act);
		//Assert.assertEquals(0.11, 0.05, DELTA);
		Mockito.verify(mockTwo).add(50, 60);
	}
	
	@Test
	public void testAdd() {
		AddThreeFun testObj = new AddThreeFun();
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		int act = testObj.add(a, b, c);
		Assert.assertEquals(exp, act);
	}

}
