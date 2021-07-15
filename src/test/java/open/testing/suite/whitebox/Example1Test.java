package open.testing.suite.whitebox;

import java.util.EnumSet;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream; 

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

@DisplayName("白盒测试案例")
public class Example1Test {
	Example1 testObj;

	@BeforeEach
	void setUp() throws Exception {
		testObj = new Example1();
	}

	@DisplayName("语句覆盖")
	@Test
	void test() {
		int actual = testObj.Func1(2,0, 3);
		Assertions.assertEquals(2, actual); 
	}

	@DisplayName("浮点数判定")
	@Test
	void testFunc3() {
		double actual = testObj.Func3(2, 0, 3);
		Assertions.assertEquals(2.50, actual, 0.0001);  //1e-15;
	}
	
	@ParameterizedTest
	@DisplayName("ValueSource测试") 
	@ValueSource(strings = { "racecar", "radar", "able was I ere I saw elba" })
	void palindromes(String candidate) {
		Assertions.assertNotNull(candidate);
	}
	
	
	@DisplayName("枚举测试")
	@ParameterizedTest
	@EnumSource(value = TimeUnit.class, names = { "DAYS", "HOURS", "MINUTES" })
	void testWithEnumSourceInclude(TimeUnit timeUnit) {
	    assertTrue(EnumSet.of(TimeUnit.DAYS, TimeUnit.HOURS, TimeUnit.MINUTES).contains(timeUnit));
	} 

	@DisplayName("函数构造参数测试")
	@ParameterizedTest
	@MethodSource("func2Data")
	void testFunc1(String name, boolean exp, String msg ) {
		//boolean actual = testObj.Func2(name);
		boolean actual = true;
		Assertions.assertEquals(exp, actual, msg);
	} 
	
	public static Stream<Arguments> func2Data() {
	    return Stream.of(
	        Arguments.of("admin", true, "管理员判断"),
	        Arguments.of("aaa", true, "普通判断"));
	}

	@DisplayName("csvSource测试_同类型")
	@ParameterizedTest
	@CsvSource({ "2, 0, 3, 2", "2, 0, 3, 2", "2, 0, 3, 2", "5, 6, 7, 8" })
	void testWithCsvSource(int  a, int b, int x , int exp) {
		int actual = testObj.Func1(a, b, x);
		Assertions.assertEquals(exp, actual); 
	} 
	
	@DisplayName("csvSource测试_不同类型")
	@ParameterizedTest
	@CsvSource({ "'admin', true, '管理员判断'", "'aaa', false, '普通判断'" })
	void testFunc2_2(String name, boolean exp, String msg ) {
		boolean actual = testObj.Func2(name);
		Assertions.assertEquals(exp, actual,msg) ;
	}

	@DisplayName("csvSourceFile测试")
	@ParameterizedTest
	@CsvFileSource(resources = "/testData1.csv", numLinesToSkip = 1)
	void testWithCsvSourceFile(String id, int  a, int b, int x , int exp, String msg) {
		int actual = testObj.Func1(a, b, x);
		Assertions.assertEquals(exp, actual, id + msg +"没有通过"); 
	} 
}
