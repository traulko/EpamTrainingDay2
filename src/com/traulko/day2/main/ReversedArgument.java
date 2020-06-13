package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;

public class ReversedArgument {
    public static void main(String[] args) {
        try {
            ArgumentService argumentService = new ArgumentService();
            ConsoleOutputService consoleOutputService = new ConsoleOutputService();

            String[] reversedArguments = argumentService.getReversedArguments(args);
            consoleOutputService.printArguments(reversedArguments);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}