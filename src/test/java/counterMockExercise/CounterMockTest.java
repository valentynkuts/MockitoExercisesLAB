package counterMockExercise;

import counter.Counter;
import counterMock.CounterMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CounterMockTest {
    @Test
    public void mockTest() {

        Counter count = Mockito.mock(Counter.class);
        Mockito.when(count.getCount()).thenReturn(4);

        CounterMock c = new CounterMock(count);
        assertEquals(16, c.valueOfCounter(4));

    }

}
