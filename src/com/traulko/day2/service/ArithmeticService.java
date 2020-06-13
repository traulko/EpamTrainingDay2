package com.traulko.day2.service;

public class ArithmeticService {
    public int[] generateRandomNumbers(int count) {
        int[] randomNumberArray = new int[count];

        for (int i = 0; i < count; i++) {
            int randomNumber = (int) (Math.random() * 20);
            randomNumberArray[i] = randomNumber;
        }

        return randomNumberArray;
    }

    public int calculateSumOfArrayElements(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return sum;
    }

    public int calculateCompositionOfArrayElements(int[] array) {
        int composition = 1;
        for (int number : array) {
            composition *= number;
        }
        return composition;
    }
}
