package open.testing.suite.mockito;

import static org.mockito.Mockito.verify;

import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ShorthandForMocksCreation07 {
    @Mock List<String> mockedList;
    //@Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void test(){
        //using mocks
        mockedList.add("one");
        verify(mockedList).add("one");
    }
}
