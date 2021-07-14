package open.testing.suite.junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests-display-names
 */

public class MyDisplayName {
}

@DisplayName("A special test case")
class DisplayNameDemo {

    @Test
    @DisplayName("Custom test name containing spaces")
    void testWithDisplayNameContainingSpaces() {
    }

    @Test
    @DisplayName("╯°□°）╯")
    void testWithDisplayNameContainingSpecialCharacters() {
    }

    @Test
    @DisplayName("支持中文")
    void testWithDisplayNameContainingSpecialCharactersCN() {
    }

    @Test
    @DisplayName("😱")
    void testWithDisplayNameContainingEmoji() {
    }

}