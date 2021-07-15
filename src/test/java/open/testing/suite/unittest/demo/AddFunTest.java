package open.testing.suite.unittest.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AddFunTest {

	@BeforeEach
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
		Assertions.assertEquals(exp, act);
	
	}
	
	@Test
	public void testAddThree() {
		int a = 50;
		int b = 60;
		int c = 30;
		int exp = 20;
		 
		AddFun testObject2 = new AddFun();
		int act2 = testObject2.addThree(a, b, c);
		Assertions.assertEquals(exp, act2);
	}

}
