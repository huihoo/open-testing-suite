package open.testing.suite.junit5;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import open.testing.suite.unittest.demo.Calculator;

import org.junit.jupiter.api.Test;

public class ThirdPartyAssertion {
}

class HamcrestAssertionsDemo {

    private final Calculator calculator = new Calculator();

    @Test
    void assertWithHamcrestMatcher() {
        assertThat(calculator.add(4, 1), is(equalTo(5)));
    }

}