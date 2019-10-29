package mockExercise;
/*
Przetestuj klasę MessageEncoder – zamockuj klasę Message, sprawdź czy metoda
 encode działa prawidłowo, wykonaj ją kilka razy i zweryfikuj za
  pomocą Mockito czy wykonała się odpowiednią ilość razy.
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MessageEncoderTest {
    @Test
    public void mockTest() {
        Message msg = Mockito.mock(Message.class);
//1
        Mockito.when(msg.getMessage()).thenReturn("one");
        assertEquals("one", msg.getMessage());

        MessageEncoder me = new MessageEncoder();
        assertEquals("ONE", me.encode(msg));
//2
        Mockito.when(msg.getMessage()).thenReturn("two");
        assertEquals("two", msg.getMessage());

        MessageEncoder me1 = new MessageEncoder();
        assertEquals("TWO", me1.encode(msg));

        Mockito.verify(msg, Mockito.times(4)).getMessage();


   }


}
