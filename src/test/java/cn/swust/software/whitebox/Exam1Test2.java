package cn.swust.software.whitebox;

 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

 

@DisplayName("Junit5测试")
class Exam1Test2 {
	private double DELTA = 1e-15;
	Exam1 testObject; 
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		testObject = new Exam1();
	}

	@Test
	@DisplayName("直接测试")
	void test() {
		int a, b, c;
		a = 2; 
		b = 0;
		c = 3;
		double actx = testObject.DoWork(a, b, c);
		int expx = 2;
		Assertions.assertEquals(expx, actx, DELTA);
	}

	@ParameterizedTest  
	@DisplayName("参数化测试")
	 @CsvSource({"1,2,3,4", "1,1,1,1", "3,4,5,6"})
	public void testFun1(int a,int b, int c, int expx) {   
		double actx = testObject.DoWork(a, b, c); 
		Assertions.assertEquals(expx, actx, DELTA);
	}
	
	@ParameterizedTest  
	@DisplayName("参数化文件测试")
	 @CsvFileSource(resources = "/testdata.csv",  numLinesToSkip = 1)
	public void testFun2(int a,int b, int c, int expx) {   
		double actx = testObject.DoWork(a, b, c); 
		Assertions.assertEquals(expx, actx, DELTA);
	}
	
}
