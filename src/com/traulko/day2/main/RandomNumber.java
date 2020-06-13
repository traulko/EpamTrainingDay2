package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.parser.CustomParser;
import com.traulko.day2.service.ArgumentService;
import com.traulko.day2.service.ArithmeticService;

public class RandomNumber {
    public static void main(String[] args) {
        ArgumentService argumentService = new ArgumentService();
        ArithmeticService arithmeticService = new ArithmeticService();
        CustomParser customParser = new CustomParser();
        ConsoleOutputService consoleOutputService = new ConsoleOutputService();

        try {
            String argument = argumentService.getArgument(args);
            int countOfNumbers = customParser.parseIntValue(argument);
            int[] randomNumberArray = arithmeticService.generateRandomNumbers(countOfNumbers);
            consoleOutputService.printIntArrayEachNewLine(randomNumberArray);
            consoleOutputService.printIntArray(randomNumberArray);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}