package cn.swust.software.unittest.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
		int exp = 140;
		 
		AddFun testObject2 = new AddFun();
		int act2 = testObject2.addThree(a, b, c);
		Assertions.assertEquals(exp, act2);
	}

}
