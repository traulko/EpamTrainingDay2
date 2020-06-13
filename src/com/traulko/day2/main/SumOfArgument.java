package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;
import com.traulko.day2.service.ArithmeticService;

public class SumOfArgument {
    public static void main(String[] args) {
        ArgumentService argumentService = new ArgumentService();
        ArithmeticService arithmeticService = new ArithmeticService();
        ConsoleOutputService consoleOutputService = new ConsoleOutputService();

        try {
            int[] intValueArray = argumentService.getIntValueArguments(args);
            int sumOfElements = arithmeticService.calculateSumOfArrayElements(intValueArray);
            int compositionOfElements = arithmeticService.calculateCompositionOfArrayElements(intValueArray);
            consoleOutputService.printSumOfArrayElements(sumOfElements);
            consoleOutputService.printCompositionOfArrayElements(compositionOfElements);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
