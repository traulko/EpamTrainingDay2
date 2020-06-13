package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;
import com.traulko.day2.service.PasswordService;

public class ComparePassword {
    public static void main(String[] args) {
        ArgumentService argumentService = new ArgumentService();
        PasswordService passwordService = new PasswordService();
        ConsoleOutputService consoleOutputService = new ConsoleOutputService();

        try {
            String argument = argumentService.getArgument(args);
            boolean isEqual = passwordService.isPasswordEqual(argument);
            consoleOutputService.printResultOfComparePasswords(isEqual);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
