package open.testing.suite.junit5;

/*
 * https://junit.org/junit5/docs/current/api/org.junit.jupiter.api/org/junit/jupiter/api/TestTemplate.html
 */

public class MyTestTemplate {
}

/*
class MyTest {
    @TestTemplate @ExtendWith(MyTestTemplateInvocationContextProvider.class)
    void testTemplate() {
        // test something
    }
}

class MyTestTemplateInvocationContextProvider
        implements TestTemplateInvocationContextProvider {
    @Override public Iterator<TestTemplateInvocationContext> provide(
            ContainerExtensionContext context) {
        return singletonIterator(new MyTestTemplateInvocationContext());
    }
}

class MyTestTemplateInvocationContext implements TestTemplateInvocationContext {
    @Override public String getDisplayName(int invocationIndex) {
        return "[" + invocationIndex + "]";
    }
    @Override public List<Extension> getAdditionalExtensions() {
        return asList(new MyParameterResolver(), new MyTestInstancePostProcessor(), ...);
    }
}
*/
