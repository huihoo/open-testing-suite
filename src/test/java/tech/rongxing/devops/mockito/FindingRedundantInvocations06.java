package tech.rongxing.devops.mockito;

import java.util.List;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class FindingRedundantInvocations06 {
    @Test
    public void test(){
        @SuppressWarnings("unchecked")
        List<String> mockedList = mock(List.class);
        //using mocks
        mockedList.add("one");
        mockedList.add("two");

        verify(mockedList).add("one");
        verify(mockedList).add("two");
        //following verification will fail
        verifyNoMoreInteractions(mockedList);
    }
}
