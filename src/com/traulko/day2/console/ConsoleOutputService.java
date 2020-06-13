package com.traulko.day2.console;

import com.traulko.day2.entity.CustomExecutor;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;

public class ConsoleOutputService {
    public void printHello(String name) {
        System.out.println("Hello, " + name);
    }

    public void printArguments(String[] args) {
        for (String argument : args) {
            System.out.print(argument + " ");
        }
    }

    public void printIntArrayEachNewLine(int[] array) {
        for (int number : array) {
            System.out.println(number);
        }
    }

    public void printIntArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }

    public void printSumOfArrayElements(int sum) {
        System.out.println("Sum is " + sum);
    }

    public void printCompositionOfArrayElements(int composition) {
        System.out.println("Composition is : " + composition);
    }

    public void printResultOfComparePasswords(boolean isEqual) {
        System.out.println("Password is equal to sample: " + isEqual);
    }

    public void printTaskDeadline(CustomExecutor executor, Calendar calendar) {
        String date = new SimpleDateFormat
                ("dd.MM.yyyy 'at' HH:mm:ss z").
                format(calendar.getTime());
        System.out.println(executor.getSurname() + " will finish this task " + date);
    }

    public void printIsBirthdayToday(boolean isBirthdayToday) {
        System.out.println("Today your birthday: " + isBirthdayToday);
    }

    public void printPersonYears(int personYears) {
        System.out.println("You are " + personYears + " years old");
    }

    public void printBirthDayOfWeek(DayOfWeek dayOfWeek) {
        System.out.println("You are was born on " + dayOfWeek);
    }
}