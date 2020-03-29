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
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class AddThreeFunTest {
	private double DELTA = 1e-15;

	@BeforeEach
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
		Assertions.assertEquals(exp, act);
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
		Assertions.assertEquals(exp, act);
	}

}
