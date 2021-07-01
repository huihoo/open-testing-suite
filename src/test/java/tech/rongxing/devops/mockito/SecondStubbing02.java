package tech.rongxing.devops.mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import org.junit.Test;

public class SecondStubbing02 {
    @Test
    public void test() {
        // You can mock concrete classes, not only interfaces
        @SuppressWarnings("unchecked")
        LinkedList<String> mockedList =(LinkedList<String>) mock(LinkedList.class);

        // stubbinging
        when(mockedList.get(0)).thenReturn("first");
        when(mockedList.get(1)).thenThrow(new RuntimeException());
        when(mockedList.get(998)).thenReturn("999");

        // following prints "first"
        System.out.println(mockedList.get(0));

        // following throws runtime exception
        try{
            System.out.println(mockedList.get(1));
            fail("Exception was not throw");
        }catch (Exception e){

        }
        // following prints "null" because get(999) was not stubbed
        System.out.println(mockedList.get(999));

        verify(mockedList).get(0);

    }
}
