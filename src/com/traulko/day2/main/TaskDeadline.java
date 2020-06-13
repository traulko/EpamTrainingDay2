package com.traulko.day2.main;

import com.traulko.day2.console.ConsoleOutputService;
import com.traulko.day2.entity.CustomExecutor;
import com.traulko.day2.exception.IncorrectValueException;
import com.traulko.day2.service.ArgumentService;
import com.traulko.day2.service.CalendarService;

import java.util.Calendar;

public class TaskDeadline {
    public static void main(String[] args) {
        ArgumentService argumentService = new ArgumentService();
        CalendarService calendarService = new CalendarService();
        ConsoleOutputService consoleOutputService = new ConsoleOutputService();

        try {
            CustomExecutor customExecutor = argumentService.getExecutorFromArguments(args);
            Calendar dateOfExecution = calendarService.calculateDateOfExecution(customExecutor);
            consoleOutputService.printTaskDeadline(customExecutor, dateOfExecution);
        } catch (IncorrectValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
