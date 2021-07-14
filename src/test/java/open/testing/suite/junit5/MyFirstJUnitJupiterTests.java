package open.testing.suite.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import open.testing.suite.unittest.demo.Calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("this is a junit5 test")
public class MyFirstJUnitJupiterTests {
    private final Calculator calculator = new Calculator();

    @Test
    void addition() {
        assertEquals(2, calculator.add(1, 1));
    }
}
