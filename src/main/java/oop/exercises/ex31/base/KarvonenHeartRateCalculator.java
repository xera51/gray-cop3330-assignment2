/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Christopher Gray
 */
package oop.exercises.ex31.base;

public class KarvonenHeartRateCalculator {

    public void displayHeartRateTable(int[] personData, double[] rangeData) {
        int age = personData[0];
        int restingHeartRate = personData[1];
        double[][] heartRates = calculateTargetHeartRateRange(personData, rangeData);

        System.out.printf("Resting Heart Rate: %d      age: %d%n" +
                        "Intensity | Rate%n----------|-------%n",
                restingHeartRate, age);

        for(double[] rate : heartRates) {
            System.out.printf("%.0f%%%7s|%3d bmp%n", rate[0] * 100, "", (int) rate[1]);
        }
    }



    public int calculateTargetHeartRate(int age, int restingHeartRate, double intensity) {
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
     */
    public double[][] calculateTargetHeartRateRange(int[] personData, double[] rangeData) {
        int age = personData[0];
        int restingHeartRate = personData[1];
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
