package open.testing.suite.mockito;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class DeepMocking {
    @Test
    public void test(){
        @SuppressWarnings("unchecked")
        List<String> mockedList = mock(List.class,Mockito.RETURNS_DEEP_STUBS);
        //Mockito.when(mockedList.iterator()).thenReturn();
        Iterator<String> iterator1 = mockedList.iterator();
        doReturn("aaa").doReturn(null).when(iterator1).next();
        //.thenReturn(null);
        Iterator<String> iterator = iterator1;
        assertNotNull(iterator);
        assertFalse(iterator.hasNext());
        assertNotNull(iterator.next());
        //assertNotNull(iterator.next());
    }
}

