package tech.rongxing.devops.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class SpyingOnRealObjects08 {
    @Test
    public void test() {
        List<String> list = new LinkedList<String>();
        List<String> spy = spy(list);

        // optionally, you can stub out some methods:
        when(spy.size()).thenReturn(100);

        // using the spy calls *real* methods
        spy.add("one");
        spy.add("two");

        // prints "one" - the first element of a list
        System.out.println(spy.get(0));
        System.out.println(spy.get(1));

        // size() method was stubbed - 100 is printed
        int spySize =spy.size();
        System.out.println("Spy size"+spySize);
        int listSize = list.size();
        System.out.println("list size"+listSize);

        assertEquals(100,spySize);
        assertEquals(0,listSize);

        assertEquals(spy.get(0),"one");
        //assertEquals(list.get(0),"one");

        // optionally, you can verify
        verify(spy).add("one");
        verify(spy).add("two");
    }
}
