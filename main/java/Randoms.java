import java.util.PrimitiveIterator;
import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected PrimitiveIterator.OfInt randomIter;;
    protected int min, max;

    public Randoms(int min, int max) {
        randomIter = new Random().ints(min, (max + 1)).iterator();
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            public boolean hasNext() {
                return true;
            }
            public Integer next() {
                return randomIter.nextInt();
            }
        };
    }
}