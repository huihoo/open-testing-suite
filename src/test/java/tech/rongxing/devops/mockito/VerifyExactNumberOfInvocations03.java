package tech.rongxing.devops.mockito;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.LinkedList;

import org.junit.Test;

public class VerifyExactNumberOfInvocations03 {

    @Test
    public void test() {
        @SuppressWarnings("unchecked")
        LinkedList<String> mockedList = (LinkedList<String>) mock(LinkedList.class);

        mockedList.add("once");

        mockedList.add("twice");
        mockedList.add("twice");

        mockedList.add("three times");
        mockedList.add("three times");
        mockedList.add("three times");

        // following two verifications work exactly the same - times(1) is used
        // by default
        verify(mockedList).add("once");
        verify(mockedList, times(1)).add("once");

        // exact number of invocations verification
        verify(mockedList, times(2)).add("twice");
        verify(mockedList, times(3)).add("three times");

        // verification using never(). never() is an alias to times(0)
        //verify(mockedList, never()).add("never happened");

        // verification using atLeast()/atMost()
        //verify(mockedList, atLeastOnce()).add("three times");
        //verify(mockedList, never()).add("five times");
        //verify(mockedList, atMost(5)).add("three times");
    }

}
