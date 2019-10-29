package counterMock;

import counter.Counter;

/*
Stwórz klasę której komponentem jest klasa Counter. Twoja klasa ma mieć metodę która
 zwraca obecną wartość licznika klasy Counter pomnożoną przez liczbę podaną w argumencie. Otestuj Twoją klasę,
 Mockując klasę Counter.
 */
public class CounterMock {

    Counter counter;

    public CounterMock(Counter c){
        this.counter = c;
    }

    public int valueOfCounter(int num){
        return counter.getCount()*num;
    }
}
