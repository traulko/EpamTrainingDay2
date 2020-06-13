package com.traulko.day2.service;

import com.traulko.day2.entity.CustomExecutor;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.parser.CustomParser;

import java.util.Calendar;

public class ArgumentService {
    public String getArgument(String[] args) throws IncorrectValueException {
        if (args.length != 1) {
            throw new IncorrectValueException("Incorrect agrument!");
        }
        return args[0];
    }

    public String[] getReversedArguments(String[] args) throws IncorrectValueException {
        if (args.length == 0) {
            throw new IncorrectValueException("Incorrect agruments!");
        }

        String[] reversedArguments = new String[args.length];
        int index = args.length - 1;

        for (int i = 0; i < args.length; i++) {
            reversedArguments[index] = args[i];
            index--;
        }

        return reversedArguments;
    }

    public int[] getIntValueArguments(String[] args) throws IncorrectValueException {
        CustomParser customParser = new CustomParser();
        if (args.length == 0) {
            throw new IncorrectValueException("Incorrect agruments!");
        }

        int[] intValueArray = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            intValueArray[i] = customParser.parseIntValue(args[i]);
        }

        return intValueArray;
    }

    public CustomExecutor getExecutorFromArguments(String[] args) throws IncorrectValueException {
        CustomParser customParser = new CustomParser();
        if (args.length != 2) {
            throw new IncorrectValueException("Count of arguments should be 2!");
        }

        String surname = args[0];
        int countOfDaysToExecute = customParser.parseIntValue(args[1]);

        return new CustomExecutor(surname, countOfDaysToExecute);
    }

    public Calendar getCalendarFromArguments(String argument) throws IncorrectValueException {
        CustomParser customParser = new CustomParser();

        String[] dateValue = argument.split("\\.");
        if (dateValue.length != 3) {
            throw new IncorrectValueException("Count of arguments should be 3!");
        }

        int day = customParser.parseIntValue(dateValue[0]);
        int month = customParser.parseIntValue(dateValue[1]) - 1;
        int year = customParser.parseIntValue(dateValue[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar;
    }
}