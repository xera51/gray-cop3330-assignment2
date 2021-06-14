/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

public class KarvonenHeartRateCalculator {

    /**
     * Calculates the target heart rates for a person, and builds a {@code String} to display the results
     *
     * @param personData An array containing a persons age at index 0 and resting heart rate at index 1
     * @param rangeData An array containing the starting intensity at index 0, the ending intensity at
     *                  index 1, and the interval at index 2
     * @return a {@code String} that displays heart rate data in a range, presented as a table
     * @see #calculateTargetHeartRateRange(double[], double[])
     */
    public String buildHeartRateTable(double[] personData, double[] rangeData) {
        StringBuilder output = new StringBuilder();
        double age = personData[0];
        double restingHeartRate = personData[1];
        double[][] heartRates = calculateTargetHeartRateRange(personData, rangeData);

        output.append(String.format("Resting Pulse: %.0f        Age: %.0f%n%n" +
                        "Intensity    | Rate%n-------------|--------%n",
                restingHeartRate, age));

        for(double[] rate : heartRates) {
            output.append(String.format("%.0f%%%10s| %3d bpm%n", rate[0] * 100, "", (int) rate[1]));
        }
        return output.toString();
    }


    /**
     * Calculates the target heart rate of a person using the Karvonen Heart Rate
     * formula.
     *
     * @param age the age
     * @param restingHeartRate the resting heart rate
     * @param intensity the intensity level
     * @return the target heart rate
     */
    public int calculateTargetHeartRate(double age, double restingHeartRate, double intensity) {
        return (int) Math.round((220 - age - restingHeartRate) * intensity + restingHeartRate);
    }

    /**
     * Returns a 2d {@code double} array containing intensity percentages and the target heart rate
     * <p>The first intensity is calculated at the given starting intensity. Each heart rate calculated
     * at an intensity one interval higher than the last. Heart rates are no longer calculated after
     * the ending intensity is reached, inclusive
     *
     * @param personData An array containing a persons age at index 0 and resting heart rate at index 1
     * @param rangeData An array containing the starting intensity at index 0, the ending intensity at
     *                  index 1, and the interval at index 2
     * @return an 2d {@code double} array containing intensity percentages and the target heart rate
     * @see #calculateTargetHeartRate(double, double, double)
     */
    public double[][] calculateTargetHeartRateRange(double[] personData, double[] rangeData) {
        double age = personData[0];
        double restingHeartRate = personData[1];
        double startIntensity = rangeData[0];
        double endIntensity = rangeData[1];
        double interval = rangeData[2];

        if(endIntensity < startIntensity) {
            throw new IllegalArgumentException("end intensity cannot be less than start intensity");
        }

        int numHeartRates = (int) Math.ceil((endIntensity - startIntensity) / interval);
        if(Math.abs((numHeartRates * interval) - (endIntensity - startIntensity)) < 0.0001) {
            numHeartRates++;
        }


        double[][] heartRates = new double[numHeartRates][];

        double currentIntensity = startIntensity;
        for(int i = 0; i < numHeartRates; i++) {
            heartRates[i] = new double[2];
            heartRates[i][0] = currentIntensity;
            heartRates[i][1] = calculateTargetHeartRate(age, restingHeartRate, currentIntensity);
            currentIntensity += interval;
        }
        return heartRates;
    }
}
