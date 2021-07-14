package open.testing.suite.junit5;

/*
 * Syntax will probably change, see https://github.com/junit-team/junit5/issues/48 for details
 */
public class MyScenarioTest {
}

/*
@ScenarioTest
class WebSecurityScenarioTest {

    @Step(next = "login")
    void visitPageRequiringAuthorizationWhileNotLoggedIn() {
        // attempt to visit page which requires that a user is logged in
    }
    @Step(next = "visitSecondPageRequiringAuthorizationWhileLoggedIn")
    void login() {
        // submit login form with valid credentials
    }
    @Step(next = "logout")
    void visitSecondPageRequiringAuthorizationWhileLoggedIn() {
        // visit another page which requires that a user is logged in
    }
    @Step(next = END)
    void logout() {
        // visit logout URL
    }
}
 */