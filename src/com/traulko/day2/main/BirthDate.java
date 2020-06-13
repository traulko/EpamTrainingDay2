package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;
import com.traulko.day2.service.CalendarService;

import java.time.DayOfWeek;
import java.util.Calendar;

public class BirthDate {
    public static void main(String[] args) {
        try {
            ArgumentService argumentService = new ArgumentService();
            ConsoleOutputService consoleOutputService = new ConsoleOutputService();
            CalendarService calendarService = new CalendarService();

            String argument = argumentService.getArgument(args);
            Calendar date = argumentService.getCalendarFromArguments(argument);
            int personYears = calendarService.calculatePersonYears(date);
            DayOfWeek birthDayOfWeek = calendarService.getBirthDayOfWeek(date);
            boolean isBirthdayToday = calendarService.isBirthdayToday(date);
            consoleOutputService.printPersonYears(personYears);
            consoleOutputService.printBirthDayOfWeek(birthDayOfWeek);
            consoleOutputService.printIsBirthdayToday(isBirthdayToday);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
