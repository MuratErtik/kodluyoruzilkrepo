package org.demo.java101;

public class HarmonicCalculator {

    public double calculateHarmonicAverage(double[] numbers) {
        double harmonicSeries = 0.0;

        for (double number : numbers) {
            harmonicSeries += 1.0 / number;
        }

        return numbers.length / harmonicSeries;
    }
}
