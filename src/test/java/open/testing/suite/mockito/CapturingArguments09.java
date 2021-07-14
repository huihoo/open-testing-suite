package open.testing.suite.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import java.util.List;

import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class CapturingArguments09 {
    @Test
    public void test() {
        @SuppressWarnings("unchecked")
        List<String> list = mock(List.class);
        list.add("one");
        list.add("two");
        list.add("three");

        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(list,Mockito.times(3)).add(argument.capture());
        // assertEquals("one", argument.getValue());

        List<String> list1 =argument.getAllValues();
        assertEquals("one",list1.get(0));
        assertEquals("two",list1.get(1));
        assertEquals("three",list1.get(2));
    }
}
