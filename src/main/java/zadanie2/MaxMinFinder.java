package zadanie2;

import java.util.ArrayList;

public class MaxMinFinder {
    public double[] findMinAndMaxNumber(ArrayList<Double> list) {
        list.sort(null);

        double[] result = {list.getFirst(), list.getLast()};

        return result;
    }
}
