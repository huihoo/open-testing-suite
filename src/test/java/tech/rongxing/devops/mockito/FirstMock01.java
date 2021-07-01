package tech.rongxing.devops.mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.Test;

public class FirstMock01 {
    @Test
    public void test() {
        // mock creation
        @SuppressWarnings("unchecked")
        List<String> mockedList = mock(List.class);

        // using mock object
        mockedList.add("one");
        mockedList.add("two");
        mockedList.add("Three");
        mockedList.clear();

        // verification
        verify(mockedList).clear();
        verify(mockedList).add("one");
        verify(mockedList).add("two");
        verify(mockedList).add("Three");
    }
}
