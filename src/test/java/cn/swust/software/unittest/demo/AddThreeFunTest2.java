package cn.swust.software.unittest.demo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith; 
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import static org.powermock.api.mockito.PowerMockito.mock; 
import static org.powermock.api.mockito.PowerMockito.verifyNew; 
import static org.powermock.api.mockito.PowerMockito.when; 
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest(AddTwoFun.class)  
public class AddThreeFunTest2 {
 
	AddTwoFun addTwo ; 
	AddThreeFun testObj;

	@Before
	public void setUp() throws Exception {
		testObj = PowerMockito.mock(AddThreeFun.class);
 
	}

	@Test
	public void testAdd() { 
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		when(addTwo.add(50, 60)).thenReturn(110);
		int act = testObj.add(a, b, c);
		 
		Assert.assertEquals(exp, act);
		 
		
	}

}
