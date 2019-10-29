package counter;
/*
Stwórz klasę Counter. Klasa ta ma być licznikiem – ma przechowywać jego obecny stan, mieć metody do zwiększania i
zmniejszania licznika. Minimalną wartością tego licznika ma być 0, największą zaś 100. Otestuj klasę Counter
tradycyjnymi unit testami bez mocków. Porządnie!
 */


public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void increase() {
        if (count < 100)
            count = count + 1;
    }

    public void decrease() {
        if (count > 0)
            count = count - 1;

    }

}
