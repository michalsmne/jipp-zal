package zadanie2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class MaxMinFinderTest {
    private MaxMinFinder maxMinFinder;

    public MaxMinFinderTest() {
        this.maxMinFinder = new MaxMinFinder();
    }

    @Test
    public void testShouldFindMaxMin() {
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(2.0);
        numbers.add(3.0);
        numbers.add(1.0);

        double[] result = this.maxMinFinder.findMinAndMaxNumber(numbers);

        Assertions.assertEquals(1.0, result[0]);
        Assertions.assertEquals(3.0, result[1]);
    }
}