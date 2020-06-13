package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;

public class Hello {
    public static void main(String[] args) {
        try {
            ArgumentService argumentService = new ArgumentService();
            ConsoleOutputService consoleOutputService = new ConsoleOutputService();

            String argument = argumentService.getArgument(args);
            consoleOutputService.printHello(argument);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}