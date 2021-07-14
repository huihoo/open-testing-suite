package open.testing.suite.unittest.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class AddThreeFunTest01 {
	
	@Mock
	AddTwoFun addTwo;
	
	@InjectMocks
	AddThreeFun testObj = new AddThreeFun();


	@BeforeEach
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testAdd() { 
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 140;
		Mockito.when(addTwo.add(50, 60)).thenReturn(110);
		int act = testObj.add(a, b, c);
		Assertions.assertEquals(exp, act);
		Mockito.verify(addTwo).add(50, 60);
		
	}

}
