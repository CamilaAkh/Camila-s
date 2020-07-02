package homework27;

import java.util.Iterator;

public class FibonacciIterable implements Iterable<Integer> {
    private class FibonacciIterator implements Iterator<Integer> {
        private int a = 0, b = 1;

        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public Integer next() {
            int c = a + b;
            a = b;
            b = c;
            return c;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new FibonacciIterator();
    }
}

