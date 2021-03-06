package open.testing.suite.junit5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/*
 * https://junit.org/junit5/docs/current/user-guide/#writing-tests-annotations
 */
public class MyAnnotations {

    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.RUNTIME)
    @Tag("fast")
    @Test
    public @interface FastTest {
    }

    @MyAnnotations.FastTest
    void myFastTest() {
    }
}


