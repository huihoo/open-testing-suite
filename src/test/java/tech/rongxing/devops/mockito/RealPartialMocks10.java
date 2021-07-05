package tech.rongxing.devops.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import org.junit.Test;
import org.mockito.Mockito;

public class RealPartialMocks10 {
    @Test
    public void test(){
        //you can create partial mock with spy() method:

        @SuppressWarnings("unchecked")
        LinkedList<String> list1 = mock(LinkedList.class);
        //Be sure the real implementation is 'safe'.
        //If real implementation throws exceptions or depends on specific state of the object then you're in trouble.

        when(list1.add("xx")).thenCallRealMethod();
        when(list1.get(anyInt())).thenCallRealMethod();
        when(list1.size()).thenCallRealMethod();
        list1.add("aaa");
        //assertEquals("aaa", list1.get(0));
        //assertEquals(1, list1.size());
    }
}
