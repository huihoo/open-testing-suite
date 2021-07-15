package open.testing.suite.mockito;

import java.util.List;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class FindingRedundantInvocations06 {
    @Test
    public void test(){
        @SuppressWarnings("unchecked")
        List<String> mockedList = mock(List.class);
        // using mocks
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("three");

        verify(mockedList).add("one");
        verify(mockedList).add("two");
        // verify(mockedList).add("three");

        // following verification will fail
        //verifyNoMoreInteractions(mockedList);
    }
}
