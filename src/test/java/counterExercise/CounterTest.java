package counterExercise;

import counter.Counter;
import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    Counter counter = new Counter(23);
    @Test
    public void increaseFrom23to24(){
        counter.increase();
        Assert.assertEquals(24, counter.getCount());

    }

    @Test
    public void decreaseFrom45to44(){
        counter.setCount(45);
        counter.decrease();
        Assert.assertEquals(44, counter.getCount());

    }

    @Test
    public void decreasetoMinus1Result0(){
        counter.setCount(0);
        counter.decrease();
        Assert.assertEquals(0, counter.getCount());

    }

    @Test
    public void increaseto101Result100(){
        counter.setCount(100);
        counter.increase();
        Assert.assertEquals(100, counter.getCount());

    }

}
