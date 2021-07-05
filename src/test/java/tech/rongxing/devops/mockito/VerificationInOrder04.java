package tech.rongxing.devops.mockito;

import java.util.List;
import org.junit.Test;

import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class VerificationInOrder04 {
    @Test
    public void test() {
        // A. Single mock whose methods must be invoked in a particular order
        @SuppressWarnings("unchecked")
        List<String> singleMock = mock(List.class);

        // using a single mock
        singleMock.add("was added first");
        singleMock.add("was added second");

        // create an inOrder verifier for a single mock
        InOrder inOrder = inOrder(singleMock);

        // following will make sure that add is first called with
        // "was added first, then with "was added second"

        inOrder.verify(singleMock).add("was added first");
        inOrder.verify(singleMock).add("was added second");

        // B. Multiple mocks that must be used in a particular order
        @SuppressWarnings("unchecked")
        List<String> firstMock = mock(List.class);
        @SuppressWarnings("unchecked")
        List<String> secondMock = mock(List.class);

        // using mocks
        firstMock.add("was called first");
        secondMock.add("was called second");

        // create inOrder object passing any mocks that need to be verified in
        // order
        InOrder inOrder1= inOrder(firstMock, secondMock);

        // following will make sure that firstMock was called before secondMock

        inOrder1.verify(firstMock).add("was called first");
        inOrder1.verify(secondMock).add("was called second");

        // Oh, and A + B can be mixed together at will
    }
}
